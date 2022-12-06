package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By facebook = By.xpath(
			"//*[@src='https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialFacebook.svg']");
	private By msgFacebook = By.xpath("//h1[@class='x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']");
	private By instagram = By.xpath(
			"//*[@src='https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialInstagram.svg']");
	private By msgInstagram = By.xpath("//h2[@class='_aacl _aacs _aact _aacx _aada']");
	private By twitter = By.xpath(
			"//*[@src='https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialTwitter.svg']");
	private By msgTwitter = By.xpath(
			"//span[text()='Perfil da CVC Viagens no Twitter. Siga-nos e saiba TUDO sobre a viagem dos sonhos!']");
	private By youTube = By.xpath(
			"//*[@src='https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialYoutube.svg']");
	private By msgyouTube = By.xpath("//yt-formatted-string[text()='CVC Viagens']");
	private By pinterest = By.xpath(
			"//*[@src='https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialPinterest.svg']");
	private By msgPinterest = By.xpath(
			"//*[text()='Bem vindo à página oficial da CVC Viagens no Pinterest.  Pra toda viagem. Pra vida toda.']");

	public By getMsgFacebook() {
		return msgFacebook;
	}

	public By getInstagram() {
		return instagram;
	}

	public By getMsgInstagram() {
		return msgInstagram;
	}

	public By getTwitter() {
		return twitter;
	}

	public By getMsgTwitter() {
		return msgTwitter;
	}

	public By getYouTube() {
		return youTube;
	}

	public By getMsgyouTube() {
		return msgyouTube;
	}

	public By getPinterest() {
		return pinterest;
	}

	public By getMsgPinterest() {
		return msgPinterest;
	}

	public By getFacebook() {
		return facebook;
	}
}
