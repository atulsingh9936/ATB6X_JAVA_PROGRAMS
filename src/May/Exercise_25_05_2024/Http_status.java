package May.Exercise_25_05_2024;

public class Http_status {
    public static void main(String[] args) {

        Httpstatuscode status = Httpstatuscode.Ok;
        System.out.println(status.getCode()+" - "+ status.getMessage());

    }

}


enum Httpstatuscode{
    Ok(  200, "OK"),
    Created ( 201, "Created"),
    Accepted ( 202, "Accepted"),
    Badrequest( 400, "Bad Request");


    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    Httpstatuscode(int code, String message) {
        this.code = code;
        this.message = message;
    }



}