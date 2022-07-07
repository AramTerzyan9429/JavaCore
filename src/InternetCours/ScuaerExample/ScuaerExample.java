package InternetCours.ScuaerExample;

public class ScuaerExample {
    private int laynutyun;
    private int erkarutyun;

    ScuaerExample(int x,int y){
        this.laynutyun=x;
        this.erkarutyun=y;
    }


    public int getplentuziErkarutyun(){
        return 2*erkarutyun+2*laynutyun;
    }
public int getMakeres(){
        return erkarutyun*laynutyun;

}
}
