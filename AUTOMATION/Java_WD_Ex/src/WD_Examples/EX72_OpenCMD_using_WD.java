package WD_Examples;

public class EX72_OpenCMD_using_WD {
	public static void main(String[] args)    {
        try{ 
                Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java -version\""); //instead of 'K' take any letter
        }
        catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
