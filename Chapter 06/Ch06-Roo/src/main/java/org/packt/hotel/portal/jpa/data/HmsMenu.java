package org.packt.hotel.portal.jpa.data;
import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooJpaActiveRecord(versionField = "", sequenceName = "", table = "hms_menu")
@RooDbManaged(automaticallyDelete = true)
@RooToString(excludeFields = { "hmsMenuBookings" })
public class HmsMenu {
}
