package ar.edu.ub.testing2017;

import ar.edu.ub.testing2017.ConsoleWarriors.CPlayer;
import ar.edu.ub.testing2017.ConsoleWarriors.CTournament;
import ar.edu.ub.testing2017.ConsoleWarriors.CWarriorBot;
import ar.edu.ub.testing2017.Flipboard.CBoard;
import ar.edu.ub.testing2017.Flipboard.CCard;
import ar.edu.ub.testing2017.Flipboard.CFlipBot;

public class CMain
{
    private CMain()
    {
    }

    private void consoleWarriorsTournament()
    {
        CTournament t = new CTournament(100);
        t.addPlayer(new CPlayer("Greiner", new CWarriorBot(t.maxAbility())));
        t.addPlayer(new CPlayer("Aguilera", new CWarriorBot("Optimus", t.maxAbility())));
        t.play();
    }
    
    private void flipboardTournament()
    {
        ar.edu.ub.testing2017.Flipboard.CTournament t = new ar.edu.ub.testing2017.Flipboard.CTournament();
        t.addPlayer(new CFlipBot("Aguilera"));
        t.addPlayer(new CFlipBot("Greiner"));
        t.play();
    }

    public static void main(String[] args)
    {
        CMain app = new CMain();
        app.consoleWarriorsTournament();
        //app.flipboardTournament();
    }
}
