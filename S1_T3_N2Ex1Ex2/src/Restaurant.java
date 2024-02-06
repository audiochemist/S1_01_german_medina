import java.util.Objects;

public class Restaurant {

    private final String NAME;
    private final int SCORE;

    public Restaurant(String name, int score) {
        this.NAME = name;
        this.SCORE = score;
    }

    public String getName() {
        return NAME;
    }

    public int getScore() {
        return SCORE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant that)) return false;
        return SCORE == that.SCORE && Objects.equals(NAME, that.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, SCORE);
    }
}
