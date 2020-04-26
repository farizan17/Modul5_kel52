/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_tugas_kel52;

/**
 *
 * @author ROG
 */
public class userService {
    
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles, matkul1, matkul2, date = "";
    
    //ini adalah constructor yang akan dijalankan disetiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"Farizan5@gmail.com", "12345", "superAdmin"},
            {"David52@gmail.com", "12345", "user"} 
        };
        String[][] histories = 
        { 
            {"Farizan52@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemograman","26-04-2020"},
            {"David52@gmail.com", "Dasar Komputer dan Pemograman", "Konsep Jaringan Komputer","26-04-2020"} 
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    matkul1 = histories [i][1];
                    matkul2 = histories [i][2];
                    date = histories [i][3];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println("matkul1 : " + matkul1);
            System.out.println("matkul2 : " + matkul2);
            System.out.println("date : " + date);
            
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}


