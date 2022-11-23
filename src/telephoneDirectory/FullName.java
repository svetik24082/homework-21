package telephoneDirectory;

import java.util.Objects;

public class FullName {
    private final   String fullName;


    public FullName (String fullName) {
        this.fullName = fullName;


    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName1 = (FullName) o;
        return Objects.equals(fullName, fullName1.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}

