package scwcdkit;

public class AddressBean implements java.io.Serializable
{
   //properties
   private String street;
   private String city;
   private String state;
   private String zip;
   
   //setters
   public void setStreet(String street){ this.street = street; }
   public void setCity(String city)    { this.city   = city;   }
   public void setState(String state)  { this.state  = state;  }
   public void setZip(String zip)      { this.zip    = zip;    }

   //getters
   public String getStreet(){ return this.street; }
   public String getCity()  { return this.city;   }
   public String getState() { return this.state;  }
   public String getZip()   { return this.zip;    }

}
