package com.mvc.Inventary.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class IssueProcessedItemDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(IssueProcessedItemDao issueProcessedItemDao)
	{
		Integer i= (Integer) this.hibernateTemplate.save(issueProcessedItemDao);
		return i;
	}
	public IssueProcessedItemDao get(int id)
	{
		IssueProcessedItemDao issueProcessedItemDao= this.hibernateTemplate.get(IssueProcessedItemDao.class,id);
		return issueProcessedItemDao;
	}
	public List<IssueProcessedItemDao> getAllIssueProcessedItemDao()
	{
		List<IssueProcessedItemDao> IssueProcessedItemDaos = this.hibernateTemplate.loadAll(IssueProcessedItemDao.class);
		return IssueProcessedItemDaos;
	}
	@Transactional
	public void deleteIssueProcessedItemDao(int IssueProcessedItemDaoid)
	{
		IssueProcessedItemDao issueProcessedItemDao=this.hibernateTemplate.get(IssueProcessedItemDao.class, IssueProcessedItemDaoid);
		this.hibernateTemplate.delete(issueProcessedItemDao);
	}
	@Transactional
	public void updateIssueProcessedItemDao(IssueProcessedItemDao issueProcessedItemDao)
	{
		this.hibernateTemplate.update(issueProcessedItemDao);
	}
}
