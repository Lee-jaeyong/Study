package com.java.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

@Component
public class BinaryCopEx {

	public void copyFile(String originPath, String copyPath) {
		File origin = new File(originPath);
		File copy = new File(copyPath);

		try {
			FileInputStream fi = new FileInputStream(origin);
			FileOutputStream fo = new FileOutputStream(copy);
			byte[] buf = new byte[1024 * 10];
			fi.read(buf);
			fo.write(buf);

			fi.close();
			fo.close();
			System.out.println(origin.getPath() + "를 " + copy.getPath() + "로 복사하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("복사 실패");
		}
	}
}
