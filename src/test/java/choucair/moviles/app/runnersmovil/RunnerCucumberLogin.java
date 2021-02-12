/**
 * @since 27/11/2017
 */
package choucair.moviles.app.runnersmovil;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
features = "src/test/resources/features"
,tags = {"@SolicitaHipoteca"}
,snippets = SnippetType.CAMELCASE
,glue = "choucair.moviles.app.definitions")

@RunWith(CucumberWithSerenity.class)
public class RunnerCucumberLogin {
}