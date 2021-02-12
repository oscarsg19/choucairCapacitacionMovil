/**
 * @since 27/11/2017
 */
package choucair.moviles.app.runnersmovil;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(
features = "src/test/resources/features"
,tags = {"@RealizaPago"}
,snippets = SnippetType.CAMELCASE
,glue = "choucair.moviles.app.definitions")

@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}