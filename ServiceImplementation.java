package anudip.JPAHibernate.service;
import java.util.List;
import anudip.JPAHibernate.dao.DaoImplementation;
import anudip.JPAHibernate.entity.Mobiles;
public class ServiceImplementation 
{
	DaoImplementation dao=new DaoImplementation();
	public void insertCustomerDetails()
	{
		dao.insertCustomerDetails();
	}
	public void insertmobile()
	{
		dao.insertmobile();
	}
	public void delete(int id)
	{
		dao.delete(id);
	}
	public void update(int id)
	{
		dao.update(id);
	}
	public void search()
	{
		dao.search();
	}
	public List<Mobiles> display()
	{
		return dao.display();
	}

}
