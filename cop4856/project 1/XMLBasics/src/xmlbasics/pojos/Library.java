package xmlbasics.pojos;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<DVD> dvds;

	public Library() {
		dvds = new ArrayList<>();
	}

	public List<DVD> getDvds() { // not a good implementation!
		return dvds;
	}

	public void setDvds(List<DVD> dvds) {
		this.dvds = dvds;
	}
	
	public void addDVD(DVD d) {
		dvds.add(d);
	}

	@Override
	public String toString() {
		return "Library [dvds=" + dvds + "]";
	}
}
