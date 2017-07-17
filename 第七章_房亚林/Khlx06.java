package homework_Chapter07;

import java.util.Scanner;

public class Khlx06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] musics  = new String[5];
		musics[0] = "Island";
		musics[1] = "Ocean";
		musics[2] = "Pretty";
		musics[3] = "Sun";
		String music = "";
		int index = 0;
		
		System.out.print("插入前的数组为：");
		for(int i = 0; i < musics.length; i ++){
			System.out.print(musics[i] + " ");
		}
		System.out.print("\n请输入歌曲名称：");
		music = input.next();
		for(int i = 0; i < musics.length; i++){
			if(musics[i].compareToIgnoreCase(music) > 0){
				index = i;
				break;
			}
		}
		for(int j = musics.length-1; j > index-1; j--){
			musics[j] = musics[j-1];
		}
		musics[index] = music;
		System.out.print("插入后的数组为：");
		for(int i = 0; i < musics.length; i ++){
			System.out.print(musics[i] + " ");
		}
	}

}
