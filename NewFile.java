package FileDemo;

import java.io.File;

import javax.swing.JOptionPane;

public class NewFile {
public void TaoFile(String path,String name) {
	try {
		File f = new File(path+"\\"+name);
		if(f.createNewFile()==true) 
			JOptionPane.showMessageDialog(null,"Tao file thanh cong");
		else JOptionPane.showMessageDialog(null,"Tao file khong thanh cong, co the file da ton tai !!!");}
		catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFile obj = new NewFile();
		obj.TaoFile("Duong dan den thu muc luu file","ten file.duoi file");
	}

}
