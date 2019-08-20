package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {
    if(!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("first2", "last2", "nick2", "company2", "address2", "12345", "test111"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().returnToHomePage();
  }

}
