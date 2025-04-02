Comparando Implementação Pura e Spring no Sistema de Pagamentos

Introdução ao Problema

Ao desenvolver um sistema de pagamentos, é comum nos depararmos com a necessidade de manter o código organizado, modular e de fácil manutenção. Neste post, comparamos duas abordagens para gerenciar dependências: uma implementação pura em Java e outra utilizando o framework Spring.

O que é Injeção de Dependência?

Injeção de Dependência (DI) é um padrão de design que permite a separação de responsabilidades ao delegar a criação de dependências a um framework ou a um container. Isso melhora a testabilidade, reutilização de código e facilita a manutenção.

Implementação em Java Puro

Abaixo está um exemplo de como a injeção de dependência pode ser feita manualmente em Java puro:

public class PaymentService {
    private PaymentProcessor processor;
    
    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }
    
    public void makePayment(String method, double amount) {
        processor.processPayment(amount);
    }
}

Aqui, a dependência PaymentProcessor é injetada via construtor, garantindo que o PaymentService possa operar de maneira desacoplada.


Implementação com Spring

Com o Spring Framework, podemos deixar essa gestão de dependências mais elegante, utilizando a anotação @Autowired.
Com os arquivos e classes que fizemos, utilizamos o Postman para testá-lo e obtivemos sucesso.

@Service
public class PaymentService {
    private final PaymentProcessor processor;
    
    @Autowired
    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }
    
    public void makePayment(String method, double amount) {
        processor.processPayment(amount);
    }
}

Dessa forma, o Spring gerencia automaticamente a criação e injeção das dependências.

![image](https://gist.github.com/user-attachments/assets/b517cd93-4f81-45a6-b291-cf5e1ac3804b)

Aqui temos nosso Payment Controller

![image](https://gist.github.com/user-attachments/assets/afd3522f-51eb-4dba-9f69-cb9e5b449f6c)

Podemos perceber que o uso do Spring favorece a modularização e facilita a expansão do sistema.

![image](https://gist.github.com/user-attachments/assets/e71e499d-27da-472b-9830-5482f064cad1)

Aqui temos ele funcionando com o postman

Conclusão

A implementação pura em Java é válida para sistemas pequenos, mas conforme o sistema cresce, manter a manutenibilidade torna-se desafiador. O uso do Spring melhora a extensibilidade, reduz a complexidade e facilita a adição de novas funcionalidades, tornando-se a melhor escolha para sistemas escaláveis.

Autores: Pedro Trofino Vaccare, Leonardo Villa, Victor Pera