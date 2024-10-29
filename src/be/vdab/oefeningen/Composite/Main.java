package be.vdab.oefeningen.Composite;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var project = new Project();
        project.addKost(
                new GrondstofKost(BigDecimal.valueOf(1_000), BigDecimal.valueOf(3)));
        project.addKost(
                new ArbeidsKost(BigDecimal.TEN, BigDecimal.valueOf(100)));
        var subProject = new Project();
        subProject.addKost(
                new GrondstofKost(BigDecimal.valueOf(1_000), BigDecimal.valueOf(4)));
        subProject.addKost(
                new ArbeidsKost(BigDecimal.TEN, BigDecimal.valueOf(200)));
        project.addKost(subProject);
        System.out.println(project.berekenKost());
    }
}
