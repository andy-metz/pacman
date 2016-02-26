package view;

import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	
	private TextureFactory t = null;

	public TextureFactory(){
		
	}
	
	public TextureFactory getInstance(){
		
		if(t == null){
			t = new TextureFactory();
		}
		
		return t;
		
	}
	
	public Texture getTexturePacman(){
		
		
		return null;
	}
	
	public Texture getTextureBlock(){
		
		
		return null;
	}
	
	
}
