import java.io.File;
import java.io.IOException;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */

	public static void main(String args[]){



	    try{
	    	 System.out.println("新規作成したいファイル名を記入しておくれ");
	    	String name = new java.util.Scanner(System.in).nextLine();
		    File newfile = new File("C:\\KisoKadai3\\"+name);
	      if (newfile.createNewFile()){
	        System.out.println("ファイルの作成に成功しました");
	      }else{
	        System.out.println("ファイルの作成に失敗しました");
	      }
	    }catch(IOException e){
	      System.out.println(e);
	    }

	  }
}
