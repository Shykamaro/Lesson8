package lviv.lgs;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Application {
    
	static void menu() {
		System.out.println();
		System.out.println("��������� �� � ����� �����");
		System.out.println("������� �� ����� � ����� � ����� ����");
		System.out.println(" ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������� �� ����� �������� ���� ����");
		System.out.println("������� �� ����� ��������� ���� ����");
		System.out.println("������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}



	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Monthes[] monthArr = Monthes.values();
		Seasons[] seasonArr = Seasons.values();
		Scanner season = new Scanner(System.in);

		while (true) {
			menu();
			System.out.println("������ ����� �� 0 �� 9");
			
			switch (season.next()) {
			case "1": {
				System.out.println("������ ����� : ");
				season = new Scanner(System.in);
				String sc = season.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.name().equalsIgnoreCase(sc)) {
						System.out.println("���� : "+m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�� ����");
				}
				break;

			}

			case "2": {

				System.out.println("������� ����� : ");
				season = new Scanner(System.in);
				String seso = season.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.getSeasons().name().equalsIgnoreCase(seso)) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("̳���� �� ����");
				}
				break;

			} 

			case "3": {

				System.out.println("������� ����� 28 - 31 : ");
				season = new Scanner(System.in);
				int mon = season.nextInt();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.getInDays() == mon) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�� ����");
				}
				break;
				
			}

			case "4": {

				System.out.println("=== ��������� ������ ���� ������� � ����������� ���� ������ ���������� ===");
				System.out.println("������� ���������� ����:");
				int numberOfDays4 = season.nextInt();

				boolean flag = false;

				for (Monthes months : monthArr) {
					if (months.getInDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("ʳ������ ��� ������ " + numberOfDays4 + " � ��������� ������:");

					for (Monthes months2 : monthArr) {
						if (months2.getInDays() < numberOfDays4) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message = "����� ������ ����!";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
				
			} 

			case "5": {

				System.out.println("������ ����� : ");
				season = new Scanner(System.in);
				int mo = season.nextInt();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.getInDays() > mo) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�� ����");
				}
				break;
				
				}

			case "6": {
				
				System.out.println("������ ����� : ");
				season = new Scanner(System.in);
				String nSeas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : seasonArr) {
					if (s.name().equals(nSeas)) {
						
						flag = true;
					}
				}
				if(flag) {
					Seasons season2 = Seasons.valueOf(nSeas);
					int ordinal = season2.ordinal();
					
					if(ordinal == seasonArr.length -1) {
						ordinal = 0;
						System.out.println(seasonArr [ordinal]);
					}else {
						System.out.println(seasonArr[ordinal+1]);
					}
				}
				
				if (!flag) {
					System.out.println("�� ����");
				}
				break;
				
				}

			case "7": {

				System.out.println("������ ����� : ");
				season = new Scanner(System.in);
				String uSeas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : seasonArr) {
					if (s.name().equals(uSeas)) {
						
						flag = true;
					}
				}
				if(flag) {
					Seasons season3 = Seasons.valueOf(uSeas);
					int ordinal = season3.ordinal();
					
					if(ordinal == seasonArr.length -1) {
						ordinal = 0;
						System.out.println(seasonArr [ordinal]);
					}else {
						System.out.println(seasonArr[ordinal-1]);
					}
				}
				
				if (!flag) {
					System.out.println("�� ����");
				}
				break;
				
			} 

			case "8": {

				System.out.println("������ ����� 28 �� 30 : ");
				season = new Scanner(System.in);
				int no = season.nextInt();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.getInDays() % 2 == 0) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�� ����");
				}
				break;
				
			} 
			
			case "9": {

				System.out.println("������ ����� 31 : ");
				season = new Scanner(System.in);
				int nom = season.nextInt();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.getInDays() % 2 == 1) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�� ����");
				}
				break;
				
			} 

			case "0": {

				System.out.println("������ ����� : ");
				season = new Scanner(System.in);
				String scs = season.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.name().equalsIgnoreCase(scs)) {
						if(m.getInDays() % 2 == 0) {
							System.out.println("���� � �� ����� ������� ��� : "+m);					
						flag = true;
					}else {
						System.out.println("���� � �� �� ����� ������� ��� : "+m);					
						}
					}
				}
				if (!flag) {
					System.out.println("�� ����");
				}
				break;

			} 

			}
		}
	}
}
