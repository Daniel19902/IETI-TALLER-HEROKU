package eud.escuelaing.arem;

import static spark.Spark.*;

public class SparkWebApp {

    public static void main(String []  arg ){
        port(getPort());
        get("/hello",(req, res) -> "hello heroku");
    }

    static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
