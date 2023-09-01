package oop.Interface;

import java.util.List;

import oop.Data.Cote;

public interface Evaluable {
    Evaluable showMention(double percentage);
    double computePercentage(List<Cote> cotes );
}
