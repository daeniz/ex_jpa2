package entity;

import entity.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-19T11:59:56")
@StaticMetamodel(Grade.class)
public class Grade_ { 

    public static volatile SingularAttribute<Grade, Person> person;
    public static volatile SingularAttribute<Grade, String> name;
    public static volatile SingularAttribute<Grade, Integer> id;
    public static volatile SingularAttribute<Grade, Integer> value;

}