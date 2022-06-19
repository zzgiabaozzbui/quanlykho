/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.util;

import java.util.Scanner;

/**
 *
 * @author Admins
 */
public class checktext {

    public checktext() {
    }
    
    
    public boolean kiemTraEmail(String email){
        boolean kiemtra;
        String input;
        String emailPattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        input = email;
        kiemtra = input.matches(emailPattern);
        return kiemtra;
    }
    //Kiểm tra định dạng số điện thoại
    //Mẫu :Mã quốc gia (3 số) – mã vùng (2 số) – số điện thoại (7 số)
    //? ở đây nghĩa là có thể có mã quốc gia hoặc không
    //matches kiểm tra xem biểu thức chính quy có khớp với mẫu hay không.
    //\\d là bất kỳ số nào từ 0 đến 9
    public boolean kiemTraSDT(String sdt){
        boolean kiemtra;
        String input;
        Scanner sc = new Scanner(System.in);
        String phonePattern = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        input = sdt;
        kiemtra = input.matches(phonePattern);
        return kiemtra;
    }

    //Kiểm tra định dạng số điện thoại
    //Mẫu :12 số tự nhiên hoặc 9 số
    public boolean kiemTraSCMND(String cmnd){
        boolean kiemtra;
        String input;
        String phonePattern = "^(\\d{12}|\\d{9})$";
        input = cmnd;
        kiemtra = input.matches(phonePattern);
        return kiemtra;
    }
}
