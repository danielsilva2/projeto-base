#language: pt
Funcionalidade: Acessar o website DemoQA e cadastrar um usuario
  Cenario: Acessar o website DemoQA e cadastrar um usuario

    Dado que ao acessar o site DemoQA
    E clicar na opcao "Forms" na pagina inicial
    E clicar na opcao "Practice Form" na pagina "Forms"
    E preencher o nome com "teste"
    E preencher o sobrenome com "tools"
    E preencher o email com "teste@emeail.com"
    E selecionar a opcao de genero "Male"
    E preencher o telefone com "1198776756"
    E selecionar a data de nascimento "20 July,2022"
    E preencher o assunto com "Arts"
    E selecionar uma ou mais opcoes de hobbie "Sports", "", ""
    E selecionar uma imagem para anexar
    E preencher o endereco com "NCR, Noida, 1000"
    E selecionar o estado "NCR"
    E selecionar a cidade "Noida"
    E clicar no botao "Submit"
    E validar que no campo "Student Name" o valor é "teste tools"
    E validar que no campo "Student Email" o valor é ""
    E validar que no campo "Gender" o valor é ""
    E validar que no campo "Mobile" o valor é ""
    E validar que no campo "Date of Birth" o valor é ""
    E validar que no campo "Hobbies" o valor é ""
    E validar que no campo "Picture" o valor é ""
    E validar que no campo "Address" o valor é ""
    E validar que no campo "State and City" o valor é "NCR Noida"
    Entao fechar o browser