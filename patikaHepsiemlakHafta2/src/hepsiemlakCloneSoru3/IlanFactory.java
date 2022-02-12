package hepsiemlakCloneSoru3;

public class IlanFactory {
	public Ilan getType(String type) {
		if(type == null) {
			return null;
		}
		if(type.equals("Arsa")) {
			return new IlanArsa();
		}
		if(type.equals("Daire")) {
			return new IlanDaire();
		}
		return null;
	}
}
