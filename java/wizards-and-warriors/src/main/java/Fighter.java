abstract class Fighter {

    boolean isVulnerable() {
        // task 2: make fighters not vulnerable as default
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    // task 1: describe a fighter
    @Override
    public String toString() {
        return ("Fighter is a Warrior");
    }

    @Override
    int damagePoints(Fighter fighter) {
        // if warrior is vulnerable, damage = 10. if not, return 6 pts
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    boolean preparedSpell = false;
    boolean isVulnerable = isVulnerable();

    // task 1: describe a fighter
    @Override
    public String toString() {
        return ("Fighter is a Wizard");
    }

    @Override
    boolean isVulnerable() {
        // task 4: Make Wizards vulnerable when not having prepared a spell

        // if preparedSpell is true, return false (not vulnerable). If not, return true
        // (is vulnerable)
        return preparedSpell ? false : true;
    }

    @Override
    int damagePoints(Fighter fighter) {
        // task 5: Calculate the damage points for a Wizard

        // return damage points that were dealt
        // if spell was prepped -> 12 points
        return !isVulnerable() ? 12 : 3;
    }

    void prepareSpell() {
        // task 3: allow wizards to prepare a spell
        preparedSpell = true;
    }

}
