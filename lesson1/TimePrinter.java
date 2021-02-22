public class TimePrinter {
public static void main(String[] args) {
int s = 4500000;       //данное количество секунд
int sec = s % 60;  //остаток в секундах неполной минуты
int m = (s - sec) / 60; //полных минут
int min = m % 60;       //остаток в минутах неполного часа
int h = (m - min) / 60; //полных часов 
int hour = h % 24;      //остатотк в часах неполного дня
int d = (h - hour) / 24; //ровное количество в днях 
int day = d % 7;      //остатотк в днях неполной недели
int w = (d - day) / 7; //ровное количество в неделях 

System.out.println(s + " секунд это ");
System.out.println(m + " минут " + sec + "секунд");
System.out.println(h + " часов " + min + " минут " + sec + "секунд");
System.out.println(d + " дней " + hour + " часов " + min + " минут " + sec + "секунд");
System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + "секунд");

//System.out.println(s + " секунд это " + w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + "секунд");
}
}