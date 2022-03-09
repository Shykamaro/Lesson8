package lviv.lgs;

public enum Monthes {
   
	JANUARY(Seasons.WINTER,31),
	FABRUARY(Seasons.WINTER,28),
	MARCH(Seasons.SPRING, 31),
	APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31),
	JUNE(Seasons.SUMMER, 30),
	JULY(Seasons.SUMMER, 31),
	AUGUST(Seasons.SUMMER, 31),
	SEPTEMBER(Seasons.AUTUMN, 30),
	OCTOBER(Seasons.AUTUMN, 30),
	NOVEMBER(Seasons.AUTUMN, 30),
	DECEMBER(Seasons.WINTER, 31);
	
	Seasons seasons;
	
	int inDays;
	
	Monthes(Seasons seasons, int inDays) {
		this.seasons=seasons;
		this.inDays=inDays;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	public int getInDays() {
		return inDays;
	}

	
}
