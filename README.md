aplicação web para gerenciar o cadastro de Subestações e Redes MT  

Sobre o Teste
Objetivo: Criar uma aplicação web para realizar operações CRUD (Create, Read, Update, Delete) nas entidades Subestação e Rede MT.  

Artefatos fornecidos: MER (Modelo Entidade-Relacionamento), script SQL e protótipo da interface gráfica.  

Requisitos obrigatórios: Implementar as páginas de Login, Lista e Inclusão.  

Tecnologias:  

Back-end: Java com framework spring  

Front-end: Vue 3 com Composition API  

Sobre o Sistema  
O sistema deve permitir o cadastro de Subestações e suas respectivas Redes MT, com as seguintes páginas:  

Login:  

Página inicial do sistema.  

Não é necessário implementar autenticação; qualquer usuário pode acessar ao clicar em "entrar".  

Lista:  

Exibe todas as subestações cadastradas.  

Funcionalidades:  

RF1: Incluir uma subestação.  

RF2: Excluir uma subestação (com confirmação).  

RF3: Alterar uma subestação.  

RF4 (bônus): Visualizar a subestação no Google Maps.  

Inclusão:  

Página para adicionar uma nova subestação e suas Redes MT.  

As operações são realizadas em memória e efetivadas no banco de dados ao clicar em "incluir".  

Mensagens de sucesso ou erro devem ser exibidas após a operação.  

Alteração:  

Página para editar uma subestação e suas Redes MT.  

Os campos de código não podem ser alterados.  

As alterações são efetivadas no banco de dados ao clicar em "efetivar alterações".  

Mensagens de sucesso ou erro devem ser exibidas após a operação.  

Página para visualizar a localização da subestação no Google Maps.  

A subestação é representada por um marcador no mapa com base nas coordenadas de latitude/longitude.
