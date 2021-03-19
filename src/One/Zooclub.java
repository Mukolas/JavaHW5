package One;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Zooclub  {

    private Map<Person,List<Pet>>club;

    public Zooclub() {
    }

    public Zooclub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zooclub zooclub = (Zooclub) o;
        return Objects.equals(club, zooclub.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club);
    }

    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }
}
