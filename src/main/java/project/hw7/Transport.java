package project.hw7;

public interface Transport {

    boolean canMove(Terrain terrain);

    boolean move(Terrain terrain, int distance);

    String getType();

}