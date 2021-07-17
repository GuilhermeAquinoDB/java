package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate copaDoMundoCatar = LocalDate.of(2022, Month.NOVEMBER, 21);

		int anos = copaDoMundoCatar.getYear() - hoje.getYear();

		System.out.println(anos);

		Period periodo = Period.between(hoje, copaDoMundoCatar);

		LocalDate proximaCopa = copaDoMundoCatar.plusYears(4);

		System.out.println(proximaCopa);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = proximaCopa.format(formatador);
		System.out.println(valorFormatado);

		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));

		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);

	}

}
