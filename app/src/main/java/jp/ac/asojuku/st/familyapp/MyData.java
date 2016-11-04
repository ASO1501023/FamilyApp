package jp.ac.asojuku.st.familyapp;

/**
 * Created by fukudomeryuga on 2016/10/28.
 */
public class MyData {

    private String coment;
    private String uranai;

    public  MyData(String comment,String uranai){
        this.coment = comment;
        this.uranai = uranai;

    }

    public String getComent(){
        return  coment;
    }

    public String  getUranai(){return  uranai;}

}
