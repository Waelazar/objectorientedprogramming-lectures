package oop.interfaces.newbiementalist.controller;

import oop.interfaces.newbiementalist.model.Card;
import oop.interfaces.newbiementalist.view.Jury;

public class MentalistGame {

    private ParticipantHotel participantHotel = new ParticipantHotel();

    public void play() {
        Deck deck = new Deck();
        Participant volunteer = participantHotel.getOneVolunteer();
        Participant mentalist = participantHotel.getOneMentalist();
        Card card1 = volunteer.pickUpOne(deck);
        Card card2 = mentalist.pickUpOne(deck);
        Jury jury = new Jury();
        jury.sayResult(card1, card2);
    }

}
