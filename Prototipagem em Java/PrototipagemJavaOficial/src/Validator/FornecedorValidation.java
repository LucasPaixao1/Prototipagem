package Validator;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.hamcrest.Matcher;

import DAO.FornecedorDAO;
import VO.FornecedorVO;

public class FornecedorValidation {
		
	
	
	public boolean validarDados(FornecedorVO fornecedorVO) {

		boolean retornoCodigo_Fornecedor = validarCodigo_Fornecedor(fornecedorVO.getCodigoFornecedor());
		boolean retornoEmpresa = validarEmpresa(fornecedorVO.getEmpresa());
		boolean retornoCnpj = validarCnpj(fornecedorVO.getCnpj());
		boolean retornoCep = validarCep(fornecedorVO.getCep());
		boolean retornoRua = validarRua(fornecedorVO.getRua());
		boolean retornoEmail= validarEmail(fornecedorVO.getEmail());
		/*boolean retornoTelefone = validarTelefone(fornecedorVO.getTelefone());
		boolean retornoCelular = validarCelular(fornecedorVO.getTelefoneCelular());*/
		if (retornoCodigo_Fornecedor == true) {
			try {
				FornecedorDAO fornecedorDAO = new FornecedorDAO();
				boolean existe = fornecedorDAO.verificaExistenciaCodigo_Fornecedor(fornecedorVO.getCodigoFornecedor());
				if (existe == true) {
					retornoCodigo_Fornecedor = true;
				} else {
					retornoCodigo_Fornecedor = false;
					JOptionPane.showMessageDialog(null, "Código do Fornecedor já Castrado", "Código Inválido",
							JOptionPane.WARNING_MESSAGE);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		if (retornoCodigo_Fornecedor == true && retornoEmail==true && retornoRua==true && retornoCnpj == true && retornoEmpresa==true /*&& retornoTelefone==true && retornoCelular==true */&& retornoCep==true) {
			return true;
		}
		return false;

	}

	private boolean validarEmail(String email) {
		boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            java.util.regex.Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                
                isEmailIdValid = true;

            } else {
                JOptionPane.showMessageDialog(null, "Corrija o Campo do E-MAIL");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Corrija o Campo do E-MAIL");
        }
        return isEmailIdValid;
	}

	private boolean validarRua(String rua) {
if(rua.trim().equals("")){
			
			JOptionPane.showMessageDialog(null, "Favor informar o nome da RUA");
			
			return false;
		}else{
		return true;
		}
	}
	

	private boolean validarCep(String cep) {
		if(cep.replaceAll("[-]", "").trim().equals("")){
			JOptionPane.showMessageDialog(null, "É nescessário preencher o campo CEP");
			return false;
		}
		if(cep.replaceAll("[-]", "").trim().equals(null)){
			JOptionPane.showMessageDialog(null, "É nescessário preencher o campo CEP");
			return false;
		}
		return true;
	}

	/*	private boolean validarCelular(String telefoneCelular) {
		if (telefoneCelular.replaceAll("[()-]", "").trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É nescessário preencher o campo Celular");
            return false;
        }
        if (telefoneCelular.replaceAll("[()-]", "").length() !=12) {
            JOptionPane.showMessageDialog(null, "Celular Inválido abaixo de 12 digitos");
            return false;
        }
        
        return true;
	}

	private boolean validarTelefone(String telefone) {
		if (telefone.replaceAll("[()-]", "").trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É nescessário preencher o campo Telefone");
            return false;
        }
        if (telefone.replaceAll("[()-]", "").length() !=11) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido abaixo de 11 digitos");
            return false;
        }
        
        return true;
	}*/

	private boolean validarEmpresa(String empresa) {
		if(empresa.trim().equals("")){
			
			JOptionPane.showMessageDialog(null, "Favor informar um nome da Empresa. Esse espaço não pode ficar em BRANCO");
			
			return false;
		}else{
		return true;
		}
	}

	private boolean validarCodigo_Fornecedor(int codigoFornecedor) {
		if (codigoFornecedor <= 0) {
			JOptionPane.showMessageDialog(null, "Código Inválido");
			
			return false;
		}
		else {
			return true;
		}
	}

	private boolean validarCnpj(String cnpj) {
		boolean retorno = true;
		

		if (cnpj.equals("")) {
			JOptionPane.showMessageDialog(null, "Obrigatório preenchimento do CNPJ");
			return false;
		}
		if (cnpj == null || cnpj.replaceAll("[./-]", "").equals("00000000000000") || cnpj.replaceAll("[./-]", "").equals("11111111111111")
				|| cnpj.replaceAll("[./-]", "").equals("22222222222222") || cnpj.replaceAll("[./-]", "").equals("33333333333333") || cnpj.replaceAll("[./-]", "").equals("44444444444444")
				|| cnpj.replaceAll("[./-]", "").equals("55555555555555") || cnpj.replaceAll("[./-]", "").equals("66666666666666") || cnpj.replaceAll("[./-]", "").equals("77777777777777")
				|| cnpj.replaceAll("[./-]", "").equals("88888888888888") || cnpj.replaceAll("[./-]", "").equals("99999999999999") || (cnpj.replaceAll("[./-]", "").length() != 14)) {
			JOptionPane.showMessageDialog(null, "Modelo de CNPJ inexistênte");
			return false;
		} else {

			char dig13, dig14;
			int sm, i, r, num, peso;
			try {
				sm = 0;
				peso = 2;
				for (i = 11; i >= 0; i--) {
					num = (int) (cnpj.replaceAll("[./-]", "").charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso + 1;
					if (peso == 10) {
						peso = 2;
					}
				}
				r = (sm % 11);
				if ((r == 0) || (r == 1)) {
					dig13 = '0';
				} else {
					dig13 = (char) ((11 - r) + 48);
				}

				sm = 0;
				peso = 2;
				for (i = 12; i >= 0; i--) {
					num = (int) (cnpj.replaceAll("[./-]", "").charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso + 1;
					if (peso == 10) {
						peso = 2;
					}
				}
				r = (sm % 11);
				if ((r == 0) || (r == 1)) {
					dig14 = '0';
				} else {
					dig14 = (char) ((11 - r) + 48);
				}
				if ((dig13 == cnpj.replaceAll("[./-]", "").charAt(12)) && (dig14 == cnpj.replaceAll("[./-]", "").charAt(13))) {
					return (true);
				} else {
					JOptionPane.showMessageDialog(null, "Favor informar um CNPJ Válido");
					return (false);
				}
			} catch (InputMismatchException erro) {
				return (false);
			}
		}

	}
	
		
		


}
