package models;

public class FolhaPagamento {
    private Funcionario funcionario;
    private int mes, ano, numeroDeHorasTrab;
    private double valorHora, impostoRenda, inss, fgts;
    
    public Funcionario getFuncionario(){
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
  
    public int getMes() {
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getNumeroDeHorasTrab(){
        return numeroDeHorasTrab;
    }
    public void setNumeroDeHorasTrab(int numeroDeHorasTrab){
        this.numeroDeHorasTrab = numeroDeHorasTrab;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    


    public double salarioBruto(){
        return  valorHora * numeroDeHorasTrab;
    }



    public double IR(){
        if(salarioBruto() < 1903.38){
            impostoRenda = 0;
        }
            else if (salarioBruto() < 2826.65){
                impostoRenda= salarioBruto()*0.075;
            }
                else if (salarioBruto() < 3751.05){
                    impostoRenda = salarioBruto()*0.15;
                }
                    else if (salarioBruto() < 4664.68){
                        impostoRenda = salarioBruto()* 0.225;
                    }
                        else if (salarioBruto() > 4664.68){
                            impostoRenda = salarioBruto()*0.275;
                        }
            
                        return impostoRenda;
    }

    public double INSS(){
        if(salarioBruto() < 1693.72){
            inss = salarioBruto()*0.08;
        }
            else if (salarioBruto() < 2822.9){
                inss = salarioBruto()*0.09;
            }
                else if (salarioBruto() < 5645.80){
                    inss = salarioBruto()*0.11;
                }
                    else if (salarioBruto() > 5645.80){
                        inss = 621.03;
                    }
        return inss;
    }

    public double fgts(){
        return fgts = salarioBruto()*0.08;
    }

    public double salarioLiquido() {
        return salarioBruto() - IR() - INSS();
    }

    @Override
    public String toString(){
        return
        "Imposto de Renda: " + IR() +
        " | Salário Bruto: " + salarioBruto() +
        " | INSS: " + INSS() +
        " | FGTS: " + fgts() +
        " | Salario Líquido: " + salarioLiquido();
    }



}
