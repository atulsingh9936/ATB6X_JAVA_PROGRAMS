package May.Exercise_28_05_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_237 {
    public static void main(String[] args) {


        // api endpoints
        // pages - login page, dashboard, homepage

        List url_pages = new ArrayList();
        url_pages.add("login page");
        url_pages.add("dashboard");
        url_pages.add("homepage");
        System.out.println(url_pages);

        for (int i = 0; i < url_pages.size(); i++) {
            System.out.println(url_pages.get(i));
        }

        for (Object page : url_pages) {
            System.out.println(page);
        }

        Iterator itr = url_pages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}