package lviv.lgs;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Application {
    
	static void menu() {
		System.out.println();
		System.out.println("ѕерев≥рити чи Ї такий м≥с€ць");
		System.out.println("¬ивести вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println(" ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("¬ивести на екран наступну пору року");
		System.out.println("¬ивести на екран попередню пору року");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");
	}



	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Monthes[] monthArr = Monthes.values();
		Seasons[] seasonArr = Seasons.values();
		Scanner season = new Scanner(System.in);

		while (true) {
			menu();
			System.out.println("¬вести цифру в≥д 0 до 9");
			
			switch (season.next()) {
			case "1": {
				System.out.println("¬вести м≥с€ць : ");
				season = new Scanner(System.in);
				String sc = season.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.name().equalsIgnoreCase(sc)) {
						System.out.println("≤снуЇ : "+m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Ќе ≥снуЇ");
				}
				break;

			}

			case "2": {

				System.out.println("¬водимо сезон : ");
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
					System.out.println("ћ≥с€ц€ не ≥снуЇ");
				}
				break;

			} 

			case "3": {

				System.out.println("¬водимо число 28 - 31 : ");
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
					System.out.println("Ќе ≥снуЇ");
				}
				break;
				
			}

			case "4": {

				System.out.println("=== ѕрограмма вывода всех мес€цев с количеством дней меньше введенного ===");
				System.out.println("¬ведите количество дней:");
				int numberOfDays4 = season.nextInt();

				boolean flag = false;

				for (Monthes months : monthArr) {
					if (months.getInDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println(" ≥льк≥сть дн≥в меньша " + numberOfDays4 + " в наступних м≥с€ц€х:");

					for (Monthes months2 : monthArr) {
						if (months2.getInDays() < numberOfDays4) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message = "“аких м≥с€цев нема!";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
				
			} 

			case "5": {

				System.out.println("¬вед≥ть число : ");
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
					System.out.println("Ќе ≥снуЇ");
				}
				break;
				
				}

			case "6": {
				
				System.out.println("¬вед≥ть сезон : ");
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
					System.out.println("Ќе ≥снуЇ");
				}
				break;
				
				}

			case "7": {

				System.out.println("¬вед≥ть сезон : ");
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
					System.out.println("Ќе ≥снуЇ");
				}
				break;
				
			} 

			case "8": {

				System.out.println("¬вед≥ть число 28 чи 30 : ");
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
					System.out.println("Ќе ≥снуЇ");
				}
				break;
				
			} 
			
			case "9": {

				System.out.println("¬вед≥ть число 31 : ");
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
					System.out.println("Ќе ≥снуЇ");
				}
				break;
				
			} 

			case "0": {

				System.out.println("¬вед≥ть м≥с€ць : ");
				season = new Scanner(System.in);
				String scs = season.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : monthArr) {
					if (m.name().equalsIgnoreCase(scs)) {
						if(m.getInDays() % 2 == 0) {
							System.out.println("≤снуЇ ≥ маЇ парну к≥льк≥сть дн≥в : "+m);					
						flag = true;
					}else {
						System.out.println("≤снуЇ ≥ маЇ не парну к≥льк≥сть дн≥в : "+m);					
						}
					}
				}
				if (!flag) {
					System.out.println("Ќе ≥снуЇ");
				}
				break;

			} 

			}
		}
	}
}
