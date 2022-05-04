package com.election.models;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Credential_details")
@NoArgsConstructor
public class Credentialsbean {

@Id
private String userID;
private String password;
private String usertype;
private int loginstatus;

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Credentialsbean)) return false;
    Credentialsbean user = (Credentialsbean) o;
    return Objects.equals(userID, user.userID) &&
            Objects.equals(password, user.password);
}
@Override
public int hashCode() {
    return Objects.hash(userID, password, usertype,loginstatus
                      );
}
@OneToOne(mappedBy = "cred", cascade = CascadeType.ALL)
private Profilebean prof;

public void setLoginstatus(int i) {
	// TODO Auto-generated method stub
	
}
public void setPassword(Object password2) {
	// TODO Auto-generated method stub
	
}
public void setUsertype(String string) {
	// TODO Auto-generated method stub
	
}
public void setUserID(String string) {
	// TODO Auto-generated method stub
	
}
public char[] getUserID() {
	// TODO Auto-generated method stub
	return null;
}
public int getLoginstatus() {
	// TODO Auto-generated method stub
	return 0;
}

}