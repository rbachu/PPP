package com.objectmentor.library.libraryRules;

import com.objectmentor.library.gateways.PatronGateway;
import com.objectmentor.library.mocks.CardPrinter;
import com.objectmentor.library.models.Patron;

public class PatronRegistrar {
  protected PatronGateway patronGateway;
  protected CardPrinter cardPrinter;

  public PatronRegistrar(PatronGateway patronGateway, CardPrinter cardPrinter) {
    this.patronGateway = patronGateway;
    this.cardPrinter = cardPrinter;
  }

  public void registerPatron(Patron patron) {
    getPatronGateway().add(patron);
    getCardPrinter().print(patron);
  }

  public PatronGateway getPatronGateway() {
    return patronGateway;
  }

  public CardPrinter getCardPrinter() {
    return cardPrinter;
  }
}
