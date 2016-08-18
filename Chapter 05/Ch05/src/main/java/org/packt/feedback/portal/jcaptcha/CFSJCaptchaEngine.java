/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.jcaptcha;

/*
 *  Customize Image Captcha Engine for JCaptcha
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.image.ImageFilter;

import com.octo.captcha.component.image.backgroundgenerator.BackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.UniColorBackgroundGenerator;
import com.octo.captcha.component.image.color.RandomListColorGenerator;
import com.octo.captcha.component.image.deformation.ImageDeformation;
import com.octo.captcha.component.image.deformation.ImageDeformationByFilters;
import com.octo.captcha.component.image.fontgenerator.FontGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.DecoratedRandomTextPaster;
import com.octo.captcha.component.image.textpaster.TextPaster;
import com.octo.captcha.component.image.textpaster.textdecorator.TextDecorator;
import com.octo.captcha.component.image.wordtoimage.DeformedComposedWordToImage;
import com.octo.captcha.component.image.wordtoimage.WordToImage;
import com.octo.captcha.component.word.wordgenerator.RandomWordGenerator;
import com.octo.captcha.component.word.wordgenerator.WordGenerator;
import com.octo.captcha.engine.image.ListImageCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;

public class CFSJCaptchaEngine extends ListImageCaptchaEngine {
	
    @SuppressWarnings("deprecation")
	protected void buildInitialFactories() {
        int minWordLength = 7;
        int maxWordLength = 7;
        int fontSize = 36;
        int imageWidth = 300;
        int imageHeight = 90;
        WordGenerator wordGenerator = new RandomWordGenerator("0123456789ABCDEFGHIJKLTYREWSZabcdefghjkmnpqrstuvwxyz");
        TextPaster randomPaster = new DecoratedRandomTextPaster(
        		minWordLength,
                maxWordLength, 
                new RandomListColorGenerator(new Color[]{
                		new Color(23, 170, 27), new Color(220, 34, 11),
                		new Color(23, 67, 172)}), new TextDecorator[]{});
        BackgroundGenerator background = new UniColorBackgroundGenerator(imageWidth, imageHeight, Color.GREEN);
        FontGenerator font = new RandomFontGenerator(fontSize, fontSize,
                new Font[]{new Font("Calibri", Font.BOLD, fontSize),
                        new Font("Times New Roman", Font.PLAIN, fontSize),
                        new Font("Arial", Font.BOLD, fontSize)});
        ImageDeformation postDef = new ImageDeformationByFilters(new ImageFilter[]{});
        ImageDeformation backDef = new ImageDeformationByFilters(new ImageFilter[]{});
        ImageDeformation textDef = new ImageDeformationByFilters(new ImageFilter[]{});
        WordToImage word2image = new DeformedComposedWordToImage(font,
                background, randomPaster, backDef, textDef, postDef);
        addFactory(new GimpyFactory(wordGenerator, word2image));
    }
}