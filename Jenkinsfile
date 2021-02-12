pipeline{
	agent any
	stages{
		stage('Actualizar Proyecto Git') {
			steps{
			checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'RepoCHMovil', url: 'https://Dev-Choucair@dev.azure.com/Dev-Choucair/AUT_Movil/_git/AUT_Movil']]])   
			}
		}
		stage('Sonar Scanner'){
			steps{
				script{
					catchError{
					sh ('sonar-scanner')
					}
				}
			}
		}
		stage('Configuracion Ambiente Ejecucion'){
			steps{
				script{
					echo 'Lanzar Appium'
					sh ('appium --address 127.0.0.1 --port 4723')
				}
			}
		}
		stage('Ejecucion Automatizacion Movil'){
			steps{
				script{
					catchError{
						String nav = "${PLATAFORMA}"
						String comando = "mvn clean test serenity:aggregate -Dwebdriver.driver=appium -Dappium.udid=${UDID} -Dappium.hub=http://127.0.0.1:4723/wd/hub"
						comando += " -Dappium.platformVersion=${VERSION_PLATAFORMA} -Dappium.deviceName=${NOMBRE_DISPOSITIVO} -Dappium.platformName=${PLATAFORMA}"
						comando += nav.equals("android") ? " -Dappium.automationName=uiautomator2" : " -Dappium.automationName=XCuiTest"
						comando += nav.equals("android") ? "-Dappium.appPackage=com.experitest.ExperiBank -Dappium.appActivity=.LoginActivity" : "-Dappium.bundleId=com.experitest.ExperiBank"
						comando += " -Dappium.app=${RUTA_APP}"
						echo 'Comando Maven: ' + comando
						sh (comando)
						       
						def myFile = new File("${WORKSPACE}/target/site/serenity/summary.txt")
						def error1 = myFile.readLines().get(5).split(":")[1].trim()
						def error2 = myFile.readLines().get(6).split(":")[1].trim()
						if(error1.toInteger() > 0 || error2.toInteger() > 0){
							throw new Exception("¡¡¡EJECUCIÓN REALIZADA CON FALLOS!!!")
						}
						echo 'Ejecución Exitosa'
					}
				}
			}
		}
		stage('HTML Publisher'){
			steps{
				script{
					echo "${WORKSPACE}/target/site/serenity"
					publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: true,
					reportDir: "${WORKSPACE}/target/site/serenity", reportFiles: 'index.html',
					reportName: 'EvidenciasAutomatizacionMovil', reportTitles: 'Serenty BDD Report'])
				}
			}
		}
		stage('Backup Evidencias'){
			steps{
				script{
					String fecha = "${BUILD_TIMESTAMP}"
					fecha = fecha.trim().replace(":","-")
					fileOperations([fileZipOperation(folderPath: "${WORKSPACE}/target/site/serenity", outputFolderPath: '')])
					fileOperations([fileRenameOperation(destination: "/Users/choucairtesting/Documents/Evidencias/serenity_" + fecha + ".zip",
					source: "${WORKSPACE}/serenity.zip")])
				}
			}
		}
	}
}