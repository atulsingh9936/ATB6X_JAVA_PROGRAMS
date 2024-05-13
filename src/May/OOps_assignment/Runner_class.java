package May.OOps_assignment;

public class Runner_class {
    public static void main(String[] args) {

        student student_info = new student();
        student_info.name="Atul";
        student_info.eyecolor ="black";
        student_info.playing();
        student_info.email_id = "atul@lcx.com";


        Payment payment_info = new Payment();
        payment_info.payment_mode="online";
        payment_info.payment_status="confirmed";
        payment_info.payment_amount = 1332;
        payment_info.payment_date = 25091998;
        payment_info.unique_id= 1234567;
        payment_info.payment();
        payment_info.card_info();
        payment_info.paidby();

        Course course_info = new Course();
        course_info.course_faculty="raman sir";
        course_info.course_payment_mode="online";
        course_info.student_enrolled= 1234;
        course_info.duration_of_course =12;
        course_info.coursename();
        course_info.couseID();
        course_info.couseID();
        course_info.postman();

    }
}
