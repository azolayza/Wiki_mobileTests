package helpers;

import config.Credentials;
import static io.restassured.RestAssured.given;

public class Browserstack {

    // DO NOT STORE CREDENTIALS, ONLY FOR EXAMPLE
    // todo hide with Owner
    public static String
            browserstackLogin = "tpuretest_lSVWc2",
            browserstackPassword = "Ggd5nW19cyeGseGGn2m6";

    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic(Credentials.config.user(), Credentials.config.key())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId +".json")
                .then()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}
