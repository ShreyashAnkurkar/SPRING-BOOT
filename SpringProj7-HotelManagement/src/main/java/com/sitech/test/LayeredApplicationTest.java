package com.sitech.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sitech.controller.MainController;
import com.sitech.vo.GuestinfoVO;

public class LayeredApplicationTest {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter guest name");
            String gname = sc.next();
            
            System.out.println("Enter guest address");
            String gaddress = sc.next();
    
            System.out.println("Enter guest contactNo");
            String gContact = sc.next();
    
            System.out.println("Enter guest No. of days to stay");
            String DaysToStay = sc.next();
    
            System.out.println("Enter per day charge");
            String ChargePerDay = sc.next();
    
            // Create Vo Class Object
            GuestinfoVO vo = new GuestinfoVO();
            // Set the local variables data to vo object
            vo.setGname(gname);
            vo.setGaddress(gaddress);
            vo.setgContact(gContact);
            vo.setChargePerDay(ChargePerDay);
            vo.setDaysToStay(DaysToStay);
    
            DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
            XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
            reader.loadBeanDefinitions("classpath:com/sitech/cfg/applicationcontext.xml");
            
            // Get the target bean class obj/controller obj
            MainController controller = factory.getBean("gcontroller", MainController.class);

            try {
                String msg = controller.processGuest(vo);
                System.out.println(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
