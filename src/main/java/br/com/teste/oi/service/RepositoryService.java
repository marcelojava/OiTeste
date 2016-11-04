package br.com.teste.oi.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.teste.oi.domain.Owner;
import br.com.teste.oi.domain.Repository;

@Service("repositoryService")
@Component
public class RepositoryService {

	private AtomicLong repositoryId = new AtomicLong(1);
	private AtomicLong ownerId = new AtomicLong(1);

	private List<Repository> repositories;

	{
		repositories = createRepositories();
	}

	private List<Repository> createRepositories() {

		Repository repository = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository1 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository2 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository3 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository4 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository5 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository6 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));
		Repository repository7 = new Repository(repositoryId.getAndIncrement(), "teste", "teste fullname",
				"teste description", "www.teste.com.br", 1, 1, 1,
				new Owner(ownerId.getAndIncrement(), "Jose Antonio", "jantonio", "teste", "teste", "teste"));

		return Arrays.asList(repository, repository1, repository2, repository3, repository4, repository5, repository6,
				repository7);
	}

	public List<Repository> getRepositories() {
		return repositories;
	}

}
