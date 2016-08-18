##Gridforms
An effort to make beautiful forms for web applications that make data entry less painful. Gridforms is a front-end library which handles the boilerplate necessary to build grid based forms.

This is my first ever open source project so please [email](mailto:contact@kumailht.com) me if you spot any errors (which you're guaranteed to find). I am only now realizing how hard it is to write even simple documentation, your help in improving it will be greatly appreciated.

###Examples
- [Gridforms Homepage](http://kumailht.com/gridforms)
- [Example Bank Account Application Form](http://kumailht.com/gridforms/example.html)

###Basic Usage

####1. Import Gridforms

There are two ways you can import the Gridforms styles:

##### Option A: Link the CSS file directly if you're fine using the defaults, like so:
  ```html
<link rel="stylesheet" type="text/css" href="gridforms.css">
```

##### Option B: Import the `gridforms.sass` file into your SASS or SCSS (recomended):
  ```css
@import gridforms.sass
```

####2. Markup your Gridform
```html
<form class="grid-form">
	<fieldset>
		<legend>Form Section</legend>
		<div data-row-span="2">
			<div data-field-span="1">
				<label>Field 1</label>
				<input type="text">
			</div>
			<div data-field-span="1">
				<label>Field 2</label>
				<input type="text">
			</div>
		</div>
	</fieldset>
</form>
```
Marking up a Gridform is quite intuitive, you'll get a handle on it quickly.
Start by giving your `<form>` element a `grid-form` class to turn it into a Gridform.

**rows**: A `<div>` element with the `data-row-span` attribute makes up a row. Give the attribute a value of `2` to divide it into 2 columns, give it a value of `3` to divide it into 3 columns and so on.

**fields**: Each row has a set of fields. Fields are wrapped in `div` elements and have a `data-field-span` attribute attached to it. Set to "1" in this example, which means the field spans 1 columns.

Optionally use a `fieldset` with a `legend` to divide your form into sections.

###Advanced Usage
**Use the `grid-form` mixin to customize and override default styles:**
```sass
.my-custom-grid-form
    +grid-form
```
**The `grid-form` mixin accepts a bunch of parameters that can be overridden. Here are all the parameters that you can customize and their default values:**
```sass
$max-columns: 12,
$font-size-large: 18px,
$legend-color: lighten(#333, 5%),
$field-padding: 8px,
$label-font-size: 10px,
$grid-border-color: #333,
$label-color: #333,
$field-focus-color: darken(#FFFDED, 5%)
```
**You can override default options by passing in custom values.**
```sass
.my-custom-grid-form
    +grid-form($field-padding: 12px)
```

###Compatibility
Include Scott Jehl's [Respond.js](https://github.com/scottjehl/Respond) if you want the form to be responsive in ie8.

###Printing
GridForms will use a `@media print` query in the CSS to ensure that the printed GridForms look as nice on paper as they do on the screen. You can use this to generate an empty form for someone to fill out on paper or you can replace the `form` `input` tags with actual content (including multi-line content) and have the form and content printed out. Everything will just scale nicely.

You don't need to do anything special to print your GridForms, you can just print from your browser using `File > Print` like normal.

However, if you are generating a PDF dynamically, such as using **[wkhtmltopdf](http://wkhtmltopdf.org/)**, you will need to include `--print-media-type` as an option on the command line. This ensures GridForms renders as a printed media type and the special `@media print` query in the CSS gets called.

Similarly, if you are using **[wicked_pdf](https://github.com/mileszs/wicked_pdf)** to generate PDFs from your Rails application, you'll need to ensure `print_media_type: true` is set as a configuration option.

###Todo

- Test forms with all possible field types
- Reset unknown styles so forms look the same wherever they're used
- Gracefully handle label overflow
- Introduce a sass file to style error/help messages
- Introduce another sass file that can style the various field types (debatable)

If you have ideas on how to improve Gridforms or if you want to contribute to this repo, shoot me an email at [contact@kumailht.com](mailto:contact@kumailht.com).
