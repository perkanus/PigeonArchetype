package SoFTTests;


import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class REST {
    static String base_url_soft = "http://10.202.1.1/ftj-soft/v1";
    static String client_id_soft = "289c50c95d0e4a469bcee19cd0fb6fd4";
    static String client_secret_soft = "0c995e4A82de473cB6c9578bf6dCF125";

    static String base_url_rior = "http://10.202.1.1:80/ftj-rior/v1";
    static String client_id_rior = "7e9e0ce2a90a4461b6050781dd054cd4";
    static String client_secret_rior = "4129f821CA70451FB5Eb0fe74513c6eb";


    @Test
    public void S4()  {

        given().queryParam("client_id",client_id_soft)
                .queryParam("client_secret",client_secret_soft)
                .queryParam("searchType", "identity_designation")
                .queryParam("searchValue", "199003082394")
                .when().get(base_url_soft + "/traveller-balances").then().log()
                .body();


/*
        System.out.println( given().queryParam("client_id",client_id_soft)
                .queryParam("client_secret",client_secret_soft)
                .when().get(base_url_soft + "/traveller-balances?searchType=identity_designation&searchValue=199003082394").getStatusCode());


 */
    }

    @Test
    public void P1()  {

        given().queryParam("client_id",client_id_soft)
                .queryParam("client_secret",client_secret_soft)
                //.pathParam("id", "199003082394")
                .when().get(base_url_soft + "/county-records/195211182018").then().log()
                .body();
    }

    @Test
    public void R2()  {
        JSONObject requestParams = new JSONObject();

        requestParams.put("timestamp", "2020-07-02T07:33:58.123+01:00");
        requestParams.put("balance_delta", 1);
        requestParams.put("permit_id", "1000000012");
        requestParams.put("allowance_id", "0000000082");
        requestParams.put("transportation_id",  "R2 - Periklis Taxi AB");
        requestParams.put("pre_booked",  "Y");

        given().queryParam("client_id",client_id_rior)
                .header("Content-Type", "application/json")
                .queryParam("client_secret",client_secret_rior)
                .body(requestParams.toString())
                .when().post( base_url_rior + "/balance-adjustments").getStatusCode();
    }

    @Test
    public void S5()  {
        JSONObject requestParams = new JSONObject();

        requestParams.put("timestamp", "2020-07-02T07:33:58.123+01:00");
        requestParams.put("balance_delta", 1);
        requestParams.put("permit_id", "1000000012");
        requestParams.put("transportation_id",  "S5 - Periklis Taxi AB");
        requestParams.put("pre_booked",  "N");

        given().queryParam("client_id",client_id_rior)
                .header("Content-Type", "application/json")
                .queryParam("client_secret",client_secret_rior)
                .body(requestParams.toString())
                .when().post( base_url_rior + "/balance-adjustments").getStatusCode();
    }
}