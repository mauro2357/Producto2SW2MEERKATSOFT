/*******************************************************************************
<<<<<<< HEAD
 * Copyright (c) 2008, 2009 IBM Corporation and others.
=======
 * Copyright (c) 2013 IBM Corporation and others.
>>>>>>> origin/master
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
<<<<<<< HEAD
 *******************************************************************************/

/**
 * Object DOMException()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Object
 */
function DOMException(){};
DOMException.prototype = new Object();
/**
 * Constant DOMException.INDEX_SIZE_ERR=1
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.          
 */
DOMException.INDEX_SIZE_ERR=1;
/**
 * Constant DOMException.DOMSTRING_SIZE_ERR=2
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.DOMSTRING_SIZE_ERR=2;
/**
 * Constant DOMException.HIERARCHY_REQUEST_ERR=3
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.           
 */
DOMException.HIERARCHY_REQUEST_ERR=3;
/**
 * Constant DOMException.WRONG_DOCUMENT_ERR=4
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.WRONG_DOCUMENT_ERR=4;
/**
 * Constant DOMException.INVALID_CHARACTER_ERR=5
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.          
 */
DOMException.INVALID_CHARACTER_ERR=5;
/**
 * Constant DOMException.NO_DATA_ALLOWED_ER=6
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.NO_DATA_ALLOWED_ER=6;
/**
 * Constant DOMException.NO_MODIFICATION_ALLOWED_ERR=7
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.NO_MODIFICATION_ALLOWED_ERR=7;
/**
 * Constant DOMException.NOT_FOUND_ERR=8
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.          
 */
DOMException.NOT_FOUND_ERR=8;
/**
 * Constant DOMException.NOT_SUPPORTED_ERR=9
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.        
 */
DOMException.NOT_SUPPORTED_ERR=9;
/**
 * Constant DOMException.INUSE_ATTRIBUTE_ERR=10
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.INUSE_ATTRIBUTE_ERR=10;
/**
 * Constant DOMException.INVALID_STATE_ERR=11
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.INVALID_STATE_ERR=11;
/**
 * Constant DOMException.SYNTAX_ERR=12
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.        
 */
DOMException.SYNTAX_ERR=12;
/**
 * Constant DOMException.INVALID_MODIFICATION_ER=13
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.           
 */
DOMException.INVALID_MODIFICATION_ER=13;
/**
 * Constant DOMException.NAMESPACE_ERR=14
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.          
 */
DOMException.NAMESPACE_ERR=14;
/**
 * Constant DOMException.NVALID_ACCESS_ERR=15
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.         
 */
DOMException.INVALID_ACCESS_ERR=15;
/**
  * Property code
  * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
  * 
  * @type Number
  * @since Standard ECMA-262 3rd. Edition 
  * @since Level 2 Document Object Model Core Definition.   
  */
DOMException.prototype.code=0;

/**
 * Object DOMImplementation()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see   Object     
 */
function DOMImplementation(){};
DOMImplementation.prototype = new Object();
/**
 * function hasFeature(feature, version)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} feature
 * @param {String} version
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition. 
 */ 
DOMImplementation.prototype.hasFeature = function(feature, version){return false;};
/**
 * function createDocumentType(qualifiedName, publicId, systemId)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} qualifiedName
 * @param {String} publicId
 * @param {String} systemId
 * @returns {DocumentType}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see DocumentType
 */ 
DOMImplementation.prototype.createDocumentType = function(qualifiedName, publicId, systemId){return new DocumentType();};
/**
 * function createDocument(namespaceURI, qualifiedName, doctype)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} namespaceURI
 * @param {String} qualifiedName
 * @param {DocumentType} doctype
 * @returns {Document}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Document
 */ 
DOMImplementation.prototype.createDocument = function(namespaceURI, qualifiedName, doctype){return new HTMLDocument();}; 

/**
 * Object DocumentFragment()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see   Node    
 */
function DocumentFragment(){};
DocumentFragment.prototype=new Node(); 

/**
 * Object Document()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node  
 */ 
function Document(){};
Document.prototype = new Node();
/**
 * Property defaultView
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type  Window
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Window  
 */ 
Document.prototype.defaultView = new Window(); 
/**
 * Property doctype
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type  DocumentType
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see DocumentType   
 */ 
Document.prototype.doctype = new DocumentType(); 
/**
 * Property implementation
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *  
 * @type   DOMImplementation
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see DOMImplementation
 */ 
Document.prototype.implementation = new DOMImplementation();
/**
 * Property documentElement 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type   Element
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 * @see Element
 */ 
Document.prototype.documentElement= new HTMLElement(); 
/**
 * Property styleSheets
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type   Array
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Document.prototype.styleSheets= new Array(); 
/**
 * function createElement(tagName)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} tagName
 * @returns {Element}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.  
 * @see Element  
 */  
Document.prototype.createElement=function(tagName){return new HTMLElement();}; 
/**
 * function createDocumentFragment()  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @returns {DocumentFragment}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition. 
 * @see DocumentFragment 
 */ 
Document.prototype.createDocumentFragment=function(){return new DocumentFragment();}; 
/**
 * function createTextNode(data)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} data
 * @returns {Text}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.  
 * @see Text 
 */ 
Document.prototype.createTextNode=function(data){return new Text();}; 
/**
 * function createComment(data)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} data
 * @returns {Comment}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition. 
 * @see Comment   
 */ 
Document.prototype.createComment=function(data){return new Comment();}; 
/**
 * function createCDATASection(data)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @param {String} data
 * @returns {CDATASection}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see CDATASection     
 */
Document.prototype.createCDATASection=function(data){}; 
/**
 * function createProcessingInstruction(target, data) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type ProcessingInstruction
 * @param {String} target
 * @param {String} data
 * @returns {ProcessingInstruction}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see ProcessingInstruction      
*/
Document.prototype.createProcessingInstruction=function(target, data){return new ProcessingInstruction();}; 
/**
 * function createAttribute(name) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *  
 * @param {String} name
 * @returns {Attr}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Attr   
 */
Document.prototype.createAttribute=function(name){return new Attr();}; 
/**
 * function createEntityReference(name) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {String} name
 * @returns {EntityReference}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see EntityReference     
 */
Document.prototype.createEntityReference=function(name){return new EntityReference();}; 
/**
 * function getElementsByTagName(tagname)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} tagname
 * @returns {NodeList}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see NodeList     
 */
Document.prototype.getElementsByTagName=function(tagname){return new NodeList();}; 
/**
 * function importNode(importedNode, deep)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *  
 * @param {Node} importedNode
 * @param {Boolean} deep
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node        
 */
Document.prototype.importNode=function(importedNode, deep){return new Node();}; 
/**
 * function createElementNS(namespaceURI, qualifiedName) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} namespaceURI
 * @param {String} qualifiedName
 * @returns {Element}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Element        
 */
Document.prototype.createElementNS=function(namespaceURI, qualifiedName){return new HTMLElement();}; 
/**
 * function createEvent(String eventType) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} eventType
 * @returns {Object}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Element        
 */
Document.prototype.createEvent=function(eventType){return new Object();}; 
/**
 * function createAttributeNS(namespaceURI, qualifiedName)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} namespaceURI
 * @param {String} qualifiedName
 * @returns {Attr}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see  Attr       
 */
Document.prototype.createAttributeNS=function(namespaceURI, qualifiedName){return new Attr();}; 
/**
 * function getElementsByTagNameNS(namespaceURI, localName)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {NodeList}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see  NodeList       
 */
Document.prototype.getElementsByTagNameNS=function(namespaceURI, localName){return new NodeList();}; 
/**
 * function getElementById(elementId)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} elementId
 * @returns {Element}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Element         
 */ 
Document.prototype.getElementById=function(elementId){return new HTMLElement();};

/**
 * Object Node()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Object
 * @constructor
 * @memberOf Node
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Object    
 */
function Node(){};
Node.prototype=new Object(); 
/**
 * Constant Node.ELEMENT_NODE=1
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.ELEMENT_NODE=1; 
/**
 * Constant Node.ATTRIBUTE_NODE=2
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.ATTRIBUTE_NODE=2;
/**
 * Constant Node.TEXT_NODE=3
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.TEXT_NODE=3;
/**
 * Constant Node.CDATA_SECTION_NODE=4
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.CDATA_SECTION_NODE=4; 
/**
 * Constant Node.ENTITY_REFERENCE_NODE=5
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.ENTITY_REFERENCE_NODE=5; 
/**
 * Constant Node.ENTITY_NODE=6
 * @type Number
 * @memberOf Node
 * @see Node 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.

 * @see    http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html     
*/
Node.ENTITY_NODE=6;
/**
 * Constant Node.PROCESSING_INSTRUCTION_NODE=7
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.PROCESSING_INSTRUCTION_NODE=7; 
/**
 * Constant Node.COMMENT_NODE=8
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.COMMENT_NODE=8;
/**
 * Constant Node.DOCUMENT_NODE=9
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.DOCUMENT_NODE=9;
/**
 * Constant Node.DOCUMENT_TYPE_NODE=10
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.DOCUMENT_TYPE_NODE=10; 
/**
 * Constant Node.DOCUMENT_FRAGMENT_NODE=11
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.DOCUMENT_FRAGMENT_NODE=11; 
/**
 * Constant Node.NOTATION_NODE=12
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @constant
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */
Node.NOTATION_NODE=12;
/**
 * Property nodeName
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.  
 */ 
Node.prototype.nodeName = ""; 
/**
 * Property nodeValue
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type String
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Node.prototype.nodeValue = ""; 
/**
 * Property nodeType
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */  
Node.prototype.nodeType = 0; 
/**
 * Property parentNode 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type Node
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */  
Node.prototype.parentNode=new Node(); 
/**
 * Property childNodes 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 *  
 * @type NodeList
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see NodeList    
*/ 
Node.prototype.childNodes=new NodeList(); 
/**
 * Property firstChild 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type Node
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */  
Node.prototype.firstChild=new Node(); 
/**
 * Property lastChild 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type Node
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */  
Node.prototype.lastChild=new Node();  
/**
 * Property previousSibling 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type Node
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */  
Node.prototype.previousSibling=new Node(); 
/**
 * Property nextSibling  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type Node
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */  
Node.prototype.nextSibling=new Node(); 
/**
 * Property attributes  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type NamedNodeMap
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 * @see NamedNodeMap
 */ 
Node.prototype.attributes=new NamedNodeMap();
/**
 * Property ownerDocument  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *  
 * @type Document
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Document    
 */ 
Node.prototype.ownerDocument = new HTMLDocument(); 
/**
 * Property namespaceURI 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.   
 */ 
Node.prototype.namespaceURI=""; 
/**
 * Property prefix 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @type String
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */ 
Node.prototype.prefix = ""; 
/**
 * Property localName   
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */ 
Node.prototype.localName= "";
/**
 * function insertBefore(newChild, refChild) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {Node} newChild
 * @param {Node} refChild
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node  
 */  
Node.prototype.insertBefore = function(newChild, refChild){return new Node();}; 
/**
 * function replaceChild(newChild, oldChild) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {Node} newChild
 * @param {Node} oldChild
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node  
 */ 
Node.prototype.replaceChild = function(newChild, oldChild){return new Node();}; 
/**
 * function removeChild(oldChild) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {Node} oldChild
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node  
 */ 
Node.prototype.removeChild = function(oldChild){return new Node();}; 
/**
 * function appendChild(newChild) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {Node} newChild
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node  
 */  
Node.prototype.appendChild = function(newChild){return new Node();}; 
/**
 * function hasChildNodes() 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.  
 */ 
Node.prototype.hasChildNodes=function(){return false;}; 
/**
 * function cloneNode(deep) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {Boolean} deep
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node  
 */ 
Node.prototype.cloneNode=function(deep){return new Node();}; 
/**
 * function normalize() 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 */ 
Node.prototype.normalize = function(){}; 
/**
 * function isSupported(feature, version)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @param {String} feature
 * @param {String} version
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition. 
 */ 
Node.prototype.isSupported=function(feature, version){return false;}; 
/**
 * function hasAttributes()   
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 *   
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition. 
 */ 
Node.prototype.hasAttributes=function(){return false;};

/**
 * Object NodeList()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Object
 */
function NodeList(){};
NodeList.prototype = new Object();
/**
 * Property length   
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.  
 */ 
NodeList.prototype.length=0; 
/**
 * function item(index) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *     Note: This object can also be dereferenced using square bracket notation (e.g. obj[1]). Dereferencing with an integer index is equivalent to invoking the item method with that index 
 * 
 * @param {Number} index
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node     
*/ 
NodeList.prototype.item = function(index){return new Node();}; 

/**
 * Object NamedNodeMap()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Object
 */
function NamedNodeMap(){};
NamedNodeMap.prototype = new Object();
/**
 * Property length 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.   
 */
NamedNodeMap.prototype.length=0; 
/**
 * function getNamedItem(name) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} name
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */  
NamedNodeMap.prototype.getNamedItem=function(name){return new Node();}; 
/**
 * function setNamedItem(arg) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {Node} arg
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */ 
NamedNodeMap.prototype.setNamedItem=function(arg){return new Node();}; 
/**
 * function removeNamedItem(name)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} name
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */ 
NamedNodeMap.prototype.removeNamedItem=function(name){return new Node();}; 
/**
 * function item(index)
 * Note: This object can also be dereferenced using square bracket notation (e.g. obj[1]). Dereferencing with an integer index is equivalent to invoking the item method with that index.
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {Number} index
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */ 
NamedNodeMap.prototype.item=function(index){return new Node();}; 
/**
 * function getNamedItemNS(namespaceURI, localName) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */ 
NamedNodeMap.prototype.getNamedItemNS=function(namespaceURI, localName){return new Node();}; 
/**
 * function setNamedItemNS(arg) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {Node} arg
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */ 
NamedNodeMap.prototype.setNamedItemNS=function(arg){return new Node();}; 
/**
 * function removeNamedItemNS(namespaceURI, localName)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {Node}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.
 * @see Node    
 */ 
NamedNodeMap.prototype.removeNamedItemNS=function(namespaceURI, localName){return new Node();}; 

/**
 * Object CharacterData()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */ 
function CharacterData(){};
CharacterData.prototype=new Node();
/**
 * Property data
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   String
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 */
CharacterData.prototype.data=""; 
/**
 * Property length
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 */
CharacterData.prototype.length=0; 
/**
 * function substringData(offset, count)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 *  
 * @param {Number} offset
 * @param {Number} count
 * @returns {String}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
CharacterData.prototype.substringData=function(offset, count){return "";}; 
/**
 * function appendData(arg)    
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 *  
 * @param {String} arg
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */  
CharacterData.prototype.appendData=function(arg){}; 
/**
 * function insertData(offset, arg)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 *  
 * @param {Number} offset
 * @param {String} arg
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
CharacterData.prototype.insertData=function(offset, arg){};  
/**
 * function deleteData(offset, count)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 *  
 * @param {Number} offset
 * @param {Number} count
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
CharacterData.prototype.deleteData=function(offset, count){}; 
/**
 * function replaceData(offset, count, arg)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html  
 *  
 * @param {Number} offset
 * @param {Number} count
 * @param {String} arg
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
CharacterData.prototype.replaceData=function(offset, count, arg){}; 

/**
 * Object Attr()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */
function Attr(){};
Attr.prototype = new Node();
/**
 * Property name
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Attr.prototype.name = ""; 
/**
 * Property specified
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Attr.prototype.specified = false; 
/**
 * Property value 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   String
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Attr.prototype.value = "";
/**
 * Property ownerElement 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type   Element
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Element  
 */ 
Attr.prototype.ownerElement = new Element();

/**
 * Object Element()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */
function Element(){};
Element.prototype=new Node(); 
/**
 * Property tagName  
 * @type   String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.     
 */
Element.prototype.tagName="";
/**
 * function addEventListener(Stirng type, Function listener, Boolean useCapture) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @param {String} type
 * @param {Function} listener
 * @param {Boolean} useCapture
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.addEventListener=function(type, listener, useCapture){}; 
/**
 * function attachEvent(String type, Function listener) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @param {String} type
 * @param {Function} listener
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.attachEvent=function(type, listener){}; 
/**
 * function detachEvent(String type, Function listener) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @param {String} type
 * @param {Function} listener
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.detachEvent=function(type, listener){}; 
/**
 * function dispatchEvent(Object event) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @param {Object} event
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.dispatchEvent=function(event){return false;}; 
/**
 * function getAttribute(name) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} name
 * @returns {String}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.getAttribute=function(name){return "";}; 
/**
 * function setAttribute(name, value) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} name
 * @param {String} value
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.setAttribute=function(name, value){}; 
/**
 * function removeAttribute(name)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} name
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.removeAttribute=function(name){}; 
/**
 * function getAttributeNode(name)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} name
 * @returns {Attr}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.getAttributeNode=function(name){return new Attr();}; 
/**
 * function setAttributeNode(newAttr)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {Attr} newAttr
 * @returns {Attr}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.setAttributeNode=function(newAttr){return new Attr();}; 
/**
 * function removeAttributeNode(oldAttr) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {Attr} oldAttr
 * @returns {Attr}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Element.prototype.removeAttributeNode=function(oldAttr){return new Attr();}; 
/**
 * function getElementsByTagName(name)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} name
 * @returns {NodeList}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.getElementsByTagName=function(name){return new NodeList();}; 
/**
 * function getAttributeNS(namespaceURI, localName) 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {String}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.getAttributeNS=function(namespaceURI, localName){return "";}; 
/**
 * function setAttributeNS(namespaceURI, qualifiedName, value)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} namespaceURI
 * @param {String} qualifiedName
 * @param {String} value
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.setAttributeNS=function(namespaceURI, qualifiedName, value){}; 
/**
 * function removeAttributeNS(namespaceURI, localName)  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} namespaceURI
 * @param {String} localName
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Element.prototype.removeAttributeNS=function(namespaceURI, localName){}; 
/**
 * function getAttributeNodeNS(namespaceURI, localName)   
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {Attr}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.getAttributeNodeNS=function(namespaceURI, localName){return new Attr();}; 
/**
 * function setAttributeNodeNS(newAttr)    
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {Attr} newAttr
 * @returns {Attr}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.setAttributeNodeNS=function(newAttr){return new Attr();}; 
/**
 * function getElementsByTagNameNS(namespaceURI, localName)   
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {NodeList}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.getElementsByTagNameNS=function(namespaceURI, localName){return new NodeList();}; 
/**
 * function hasAttribute(name)   
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} name
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */ 
Element.prototype.hasAttribute=function(name){return false;}; 
/**
 * function hasAttributeNS(namespaceURI, localName)    
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 *  
 * @param {String} namespaceURI
 * @param {String} localName
 * @returns {Boolean}
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
Element.prototype.hasAttributeNS=function(namespaceURI, localName){return false;}; 

/**
 * Object Text()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments CharacterData
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see CharacterData
 */
function Text(){};
Text.prototype = new CharacterData();
/**
 * function splitText(offset)
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @param {Number} offset
 * @returns {Text}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Text
 */
Text.prototype.splitText = function(offset) {return new Text();};

/**
 * Object Comment()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments CharacterData
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see CharacterData
 */
function Comment(){};
Comment.prototype = new CharacterData();

/**
 * Object CDATASection()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Text
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Text
 */
function CDATASection(){};
CDATASection.prototype = new Text();

/**
 * Object DocumentType()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */
function DocumentType(){};
DocumentType.prototype = new Node();
/**
 * Property name
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type String 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
DocumentType.prototype.name=""; 
/**
 * Property entities
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type NamedNodeMap 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
DocumentType.prototype.entities = new NamedNodeMap();
/**
 * Property notations 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type NamedNodeMap 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
DocumentType.prototype.notations=new NamedNodeMap(); 
/**
 * Property publicId 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type String 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
DocumentType.prototype.publicId=""; 
/**
 * Property systemId  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type String 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
DocumentType.prototype.systemId=""; 
/**
 * Property internalSubset 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @type String 
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.    
 */
DocumentType.prototype.internalSubset="";

/**
 * Object Notation()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */
function Notation(){};
Notation.prototype=new Node(); 
/**
 * Property publicId 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */  
Notation.prototype.publicId=""; 
/**
 * Property systemId 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */ 
Notation.prototype.systemId="";

/**
 * Object Entity()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */ 
function Entity(){}; 
Entity.prototype=new Node();
/**
 * Property publicId 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */  
Entity.prototype.publicId="";
/**
 * Property systemId 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */  
Entity.prototype.systemId=""; 
/**
 * Property notationName 
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */  
Entity.prototype.notationName=""; 

/**
 * Object EntityReference()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */ 
function EntityReference(){};
EntityReference.prototype=new Node();

/**
 * Object ProcessingInstruction()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html
 * 
 * @augments Node
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Core Definition.
 * @see Node
 */ 
function ProcessingInstruction(){}; 
ProcessingInstruction.prototype=new Node();
/**
 * Property target  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */ 
ProcessingInstruction.prototype.target="";
/**
 * Property target  
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/ecma-script-binding.html 
 * 
 * @type String
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition 
 * @since Level 2 Document Object Model Core Definition.     
 */ 
ProcessingInstruction.prototype.data=""; 


/*HTML DOM Below this line*/

/**
 * Object HTMLCollection()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */ 
function HTMLCollection(){};
HTMLCollection.prototype = new Object();
/**
 * Property length
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLCollection.prototype.length=0;
/**
 * function item(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLCollection.prototype.item = function(index){return new Node();};
/**
 * function namedItem(name)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {String} name
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLCollection.prototype.namedItem = function(index){return new Node();};

/**
 * Object HTMLOptionsCollection()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */ 
function HTMLOptionsCollection(){};
HTMLOptionsCollection.prototype = new Object();
/**
 * Property length
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionsCollection.prototype.length=0;
/**
 * function item(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionsCollection.prototype.item = function(index){return new Node();};
/**
 * function namedItem(name)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {String} name
 * @returns {Node}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionsCollection.prototype.namedItem = function(index){return new Node();};

/**
 * Object HTMLDocument()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments Document
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see Document
 */ 
function HTMLDocument(){};
HTMLDocument.prototype = new Document();
/**
 * Property title
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.title="";
/**
 * Property referrer
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.referrer="";
/**
 * Property domain
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.domain="";
/**
 * Property URL
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.URL="";
/**
 * Property body
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.body=new HTMLElement();
/**
 * Property images
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.images=new HTMLCollection();
/**
 * Property applets
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.applets=new HTMLCollection();
/**
 * Property links
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.links=new HTMLCollection();
/**
 * Property forms
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.forms=new HTMLCollection();
/**
 * Property anchors
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.anchors=new HTMLCollection();
/**
 * Property cookie
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.cookie="";
/**
 * Property lastModified
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.lastModified="";
/**
 * function open()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.open = function(){};
/**
 * function close()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.close = function(){};
/**
 * function write(text)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {String} text
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.write = function(text){};
/**
 * function writeln(text)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {String} text
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.writeln = function(text){};
/**
 * function getElementsByName(elementName)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {String} elementName
 * @returns {NodeList}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDocument.prototype.getElementsByName = function(elementName){return new NodeList();};

/**
 * Object HTMLElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments Element
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see Element
 */ 
function HTMLElement(){};
HTMLElement.prototype = new Element();
/**
 * Property id
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLElement.prototype.id="";
/**
 * Property title
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLElement.prototype.title="";
/**
 * Property lang
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLElement.prototype.lang="";
/**
 * Property dir
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLElement.prototype.dir="";
/**
 * Property className
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLElement.prototype.className="";
/**
 * Property innerHTML
 * 
 * @type String
 */
HTMLElement.prototype.innerHTML="";
/**
 * Property offsetHeight
 * 
 * @type Number
 */
HTMLElement.prototype.offsetHeight=0;
/**
 * Property offsetWidth
 * 
 * @type Number
 */
HTMLElement.prototype.offsetWidth=0;
/**
 * Property offsetLeft
 * 
 * @type Number
 */
HTMLElement.prototype.offsetLeft=0;
/**
 * Property offsetTop
 * 
 * @type Number
 */
HTMLElement.prototype.offsetTop=0;
/**
 * Property offsetParent
 * 
 * @type HTMLElement
 */
HTMLElement.prototype.offsetParent = new HTMLElement();
/**
 * Property scrollHeight
 * 
 * @type Number
 */
HTMLElement.prototype.scrollHeight=0;
/**
 * Property scrollWidth
 * 
 * @type Number
 */
HTMLElement.prototype.scrollWidth=0;
/**
 * Property scrollLeft
 * 
 * @type Number
 */
HTMLElement.prototype.scrollLeft=0;
/**
 * Property scrollTop
 * 
 * @type Number
 */
HTMLElement.prototype.scrollTop=0;
/**
 * Property style
 * 
 * @type CSS2Properties
 */
HTMLElement.prototype.style = new CSS2Properties();

/**
 * Object HTMLHtmlElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLHtmlElement(){};
HTMLHtmlElement.prototype = new HTMLElement();
/**
 * Property version
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHtmlElement.prototype.version="";

/**
 * Object HTMLHeadElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLHeadElement(){};
HTMLHeadElement.prototype = new HTMLElement();
/**
 * Property profile
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHeadElement.prototype.profile="";

/**
 * Object HTMLLinkElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLLinkElement(){};
HTMLLinkElement.prototype = new HTMLElement();
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.disabled=false;
/**
 * Property charset
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.charset="";
/**
 * Property href
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.href="";
/**
 * Property hreflang
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.hreflang="";
/**
 * Property media
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.media="";
/**
 * Property rel
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.rel="";
/**
 * Property rev
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.rev="";
/**
 * Property target
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.target="";
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLinkElement.prototype.type="";

/**
 * Object HTMLTitleElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTitleElement(){};
HTMLTitleElement.prototype = new HTMLElement();
/**
 * Property text
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTitleElement.prototype.text="";

/**
 * Object HTMLMetaElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLMetaElement(){};
HTMLMetaElement.prototype = new HTMLElement();
/**
 * Property content
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMetaElement.prototype.content="";
/**
 * Property httpEquiv
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMetaElement.prototype.httpEquiv="";
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMetaElement.prototype.name="";
/**
 * Property scheme
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMetaElement.prototype.scheme="";

/**
 * Object HTMLBaseElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLBaseElement(){};
HTMLBaseElement.prototype = new HTMLElement();
/**
 * Property href
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBaseElement.prototype.href="";
/**
 * Property target
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBaseElement.prototype.target="";

/**
 * Object HTMLIsIndexElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLIsIndexElement(){};
HTMLIsIndexElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIsIndexElement.prototype.form=new HTMLFormElement();
/**
 * Property prompt
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIsIndexElement.prototype.prompt="";

/**
 * Object HTMLStyleElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLStyleElement(){};
HTMLStyleElement.prototype = new HTMLElement();
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLStyleElement.prototype.disabled=false;
/**
 * Property media
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLStyleElement.prototype.media="";
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLStyleElement.prototype.type="";

/**
 * Object HTMLBodyElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLBodyElement(){};
HTMLBodyElement.prototype = new HTMLElement();
/**
 * Property aLink
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBodyElement.prototype.aLink="";
/**
 * Property background
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBodyElement.prototype.background="";
/**
 * Property bgColor
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBodyElement.prototype.bgColor="";
/**
 * Property link
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBodyElement.prototype.link="";
/**
 * Property text
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBodyElement.prototype.text="";
/**
 * Property vLink
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBodyElement.prototype.vLink="";

/**
 * Object HTMLFormElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLFormElement(){};
HTMLFormElement.prototype = new HTMLElement();
/**
 * Property elements
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.elements=new HTMLCollection();
/**
 * Property length
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.length=0;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.name="";
/**
 * Property acceptCharset
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.acceptCharset="";
/**
 * Property action
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.action="";
/**
 * Property enctype
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.enctype="";
/**
 * Property method
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.method="";
/**
 * Property target
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.target="";
/**
 * function submit()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.submit = function(){};
/**
 * function reset()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFormElement.prototype.reset = function(){};

/**
 * Object HTMLSelectElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLSelectElement(){};
HTMLSelectElement.prototype = new HTMLElement();
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.type="";
/**
 * Property selectedIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.selectedIndex=0;
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.value="";
/**
 * Property length
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.length=0;
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.form = new HTMLFormElement();
/**
 * Property options
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLOptionsCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.options= new HTMLOptionsCollection();
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.disabled=false;
/**
 * Property multiple
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.multiple=false;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.name="";
/**
 * Property size
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.size=0;
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.tabIndex=0;
/**
 * function add(element, before)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {HTMLElement} element
 * @param {HTMLElement} before
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.add = function(element, before){};
/**
 * function remove(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.remove = function(index){};
/**
 * function blur()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.blur = function(){};
/**
 * function focus()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLSelectElement.prototype.focus = function(){};

/**
 * Object HTMLOptGroupElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLOptGroupElement(){};
HTMLOptGroupElement.prototype = new HTMLElement();
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptGroupElement.prototype.disabled=false;
/**
 * Property label
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptGroupElement.prototype.label="";

/**
 * Object Option()
 * @constructor
 * @param {String} text
 * @param {String} value
 * @param {Boolean} defaultSelected
 * @param {Boolean} selected
 */
function Option(text, value, defaultSelected, selected){};
Option.prototype = new HTMLOptionElement();
/**
 * Object HTMLOptionElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLOptionElement(){};
HTMLOptionElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.form = new HTMLFormElement();
/**
 * Property defaultSelected
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.defaultSelected=false;
/**
 * Property text
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.text="";
/**
 * Property index
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.index=0;
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.disabled=false;
/**
 * Property label
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.label="";
/**
 * Property selected
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.selected=false;
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOptionElement.prototype.value="";

/**
 * Object HTMLInputElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLInputElement(){};
HTMLInputElement.prototype = new HTMLElement();
/**
 * Property defaultValue
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.defaultValue="";
/**
 * Property defaultChecked
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.defaultChecked=false;
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.form = new HTMLFormElement();
/**
 * Property accept
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.accept="";
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.accessKey="";
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.align="";
/**
 * Property alt
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.alt="";
/**
 * Property checked
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.checked=false;
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.disabled=false;
/**
 * Property masLength
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.maxLenght=0;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.name="";
/**
 * Property readOnly
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.readOnly=false;
/**
 * Property size
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.size=0;
/**
 * Property src
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.src="";
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.tabIndex=0;
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.type="";
/**
 * Property useMap
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.useMap="";
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.value="";
/**
 * function blur()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.blur = function(){};
/**
 * function focus()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.focus = function(){};
/**
 * function select()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.select = function(){};
/**
 * function click()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLInputElement.prototype.click = function(){};

/**
 * Object HTMLTextAreaElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTextAreaElement(){};
HTMLTextAreaElement.prototype = new HTMLElement();
/**
 * Property defaultValue
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.defaultValue="";
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.form= new HTMLFormElement();
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.accessKey="";
/**
 * Property cols
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.cols=0;
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.disabled=false;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.name="";
/**
 * Property readOnly
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.readOnly=false;
/**
 * Property rows
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.rows=0;
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.tabIndex=0;
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.type="";
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.value="";
/**
 * function blur()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.blur = function(){};
/**
 * function focus()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.focus = function(){};
/**
 * function select()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTextAreaElement.prototype.select = function(){};

/**
 * Object HTMLButtonElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLButtonElement(){};
HTMLButtonElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.form = new HTMLFormElement();
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.accessKey = "";
/**
 * Property disabled
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.disabled=false;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.name="";
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.tabIndex=0;
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.type="";
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLButtonElement.prototype.value="";

/**
 * Object HTMLLabelElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLLabelElement(){};
HTMLLabelElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLabelElement.prototype.form = new HTMLFormElement();
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLabelElement.prototype.accessKey="";
/**
 * Property htmlFor
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLabelElement.prototype.htmlFor="";

/**
 * Object HTMLFieldSetElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLFieldSetElement(){};
HTMLFieldSetElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFieldSetElement.prototype.form = new HTMLFormElement();

/**
 * Object HTMLLegendElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLLegendElement(){};
HTMLLegendElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLegendElement.prototype.form = new HTMLFormElement();
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLegendElement.prototype.accessKey="";
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLegendElement.prototype.align="";

/**
 * Object HTMLUListElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLUListElement(){};
HTMLUListElement.prototype = new HTMLElement();
/**
 * Property compact
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLUListElement.prototype.compact=false;
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLUListElement.prototype.type="";

/**
 * Object HTMLOListElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLOListElement(){};
HTMLOListElement.prototype = new HTMLElement();
/**
 * Property compact
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOListElement.prototype.compact=false;
/**
 * Property start
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOListElement.prototype.start=0;
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLOListElement.prototype.type="";

/**
 * Object HTMLDListElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLDListElement(){};
HTMLDListElement.prototype = new HTMLElement();
/**
 * Property compact
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDListElement.prototype.compact=false;

/**
 * Object HTMLDirectoryElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLDirectoryElement(){};
HTMLDirectoryElement.prototype = new HTMLElement();
/**
 * Property compact
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDirectoryElement.prototype.compact=false;

/**
 * Object HTMLMenuElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLMenuElement(){};
HTMLMenuElement.prototype = new HTMLElement();
/**
 * Property compact
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMenuElement.prototype.compact=false;

/**
 * Object HTMLLIElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLLIElement(){};
HTMLLIElement.prototype = new HTMLElement();
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLIElement.prototype.type="";
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLLIElement.prototype.value=0;

/**
 * Object HTMLDivElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLDivElement(){};
HTMLDivElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLDivElement.prototype.align="";

/**
 * Object HTMLParagraphElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLParagraphElement(){};
HTMLParagraphElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLParagraphElement.prototype.align="";

/**
 * Object HTMLHeadingElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLHeadingElement(){};
HTMLHeadingElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHeadingElement.prototype.align="";

/**
 * Object HTMLQuoteElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLQuoteElement(){};
HTMLQuoteElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLQuoteElement.prototype.align="";

/**
 * Object HTMLPreElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLPreElement(){};
HTMLPreElement.prototype = new HTMLElement();
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLPreElement.prototype.width=0;

/**
 * Object HTMLBRElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLBRElement(){};
HTMLBRElement.prototype = new HTMLElement();
/**
 * Property clear
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBRElement.prototype.clear="";

/**
 * Object HTMLBaseFontElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLBaseFontElement(){};
HTMLBaseFontElement.prototype = new HTMLElement();
/**
 * Property color
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBaseFontElement.prototype.color="";
/**
 * Property face
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBaseFontElement.prototype.face="";
/**
 * Property size
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLBaseFontElement.prototype.size=0;

/**
 * Object HTMLBaseFontElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLFontElement(){};
HTMLFontElement.prototype = new HTMLElement();
/**
 * Property color
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFontElement.prototype.color="";
/**
 * Property face
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFontElement.prototype.face="";
/**
 * Property size
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFontElement.prototype.size=0;

/**
 * Object HTMLHRElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLHRElement(){};
HTMLHRElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHRElement.prototype.align="";
/**
 * Property noShade
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHRElement.prototype.noShade=false;
/**
 * Property size
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHRElement.prototype.size="";
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLHRElement.prototype.width="";

/**
 * Object HTMLModElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLModElement(){};
HTMLModElement.prototype = new HTMLElement();
/**
 * Property cite
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLModElement.prototype.cite="";
/**
 * Property dateTime
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLModElement.prototype.dateTime="";

/**
 * Object HTMLAnchorElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLAnchorElement(){};
HTMLAnchorElement.prototype = new HTMLElement();
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.accessKey="";
/**
 * Property charset
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.charset="";
/**
 * Property coords
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.coords="";
/**
 * Property href
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.href="";
/**
 * Property hreflang
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.hreflang="";
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.name="";
/**
 * Property rel
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.rel="";
/**
 * Property rev
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.rev="";
/**
 * Property shape
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.shape="";
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.tabIndex=0;
/**
 * Property target
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.target="";
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.type="";
/**
 * function blur()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.blur = function(){};
/**
 * function focus()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAnchorElement.prototype.focus = function(){};

/**
 * Object Image()
 * @constructor
 * @param {Number} width
 * @param {Number} height
 */
function Image(width, height){};
Image.prototype = new HTMLImageElement();
/**
 * Object HTMLImageElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLImageElement(){};
HTMLImageElement.prototype = new HTMLElement();
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.name="";
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.align="";
/**
 * Property alt
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.alt="";
/**
 * Property border
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.border="";
/**
 * Property height
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.height=0;
/**
 * Property hspace
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.hspace=0;
/**
 * Property isMap
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.isMap=false;
/**
 * Property longDesc
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.longDesc="";
/**
 * Property src
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.src="";
/**
 * Property useMap
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.useMap="";
/**
 * Property vspace
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.vspace=0;
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLImageElement.prototype.width=0;

/**
 * Object HTMLObjectElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLObjectElement(){};
HTMLObjectElement.prototype = new HTMLElement();
/**
 * Property form
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLFormElement
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.form = new HTMLFormElement();
/**
 * Property code
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.code="";
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.align="";
/**
 * Property archive
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.archive="";
/**
 * Property border
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.border="";
/**
 * Property codeBase
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.codeBase="";
/**
 * Property codeType
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.codeType="";
/**
 * Property data
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.data="";
/**
 * Property declare
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.declare=false;
/**
 * Property height
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.height="";
/**
 * Property hspace
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.hspace=0;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.name="";
/**
 * Property standby
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.standby="";
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.tabIndex=0;
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.type="";
/**
 * Property useMap
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.useMap="";
/**
 * Property vspace
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.vspace=0;
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.width="";
/**
 * Property contentDocument
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Document
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLObjectElement.prototype.contentDocument= new HTMLDocument();

/**
 * Object HTMLParamElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLParamElement(){};
HTMLParamElement.prototype = new HTMLElement();
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLParamElement.prototype.name="";
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLParamElement.prototype.type="";
/**
 * Property value
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLParamElement.prototype.value="";
/**
 * Property valueType
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLParamElement.prototype.valueType="";

/**
 * Object HTMLAppletElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLAppletElement(){};
HTMLAppletElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.align="";
/**
 * Property alt
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.alt="";
/**
 * Property archive
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.archive="";
/**
 * Property code
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.code="";
/**
 * Property codeBase
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.codeBase="";
/**
 * Property height
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.hight="";
/**
 * Property hspace
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.hspace=0;
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.name="";
/**
 * Property object
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.object="";
/**
 * Property vspace
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.vspace=0;
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAppletElement.prototype.width="";

/**
 * Object HTMLMapElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLMapElement(){};
HTMLMapElement.prototype = new HTMLElement();
/**
 * Property areas
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMapElement.prototype.areas = new HTMLCollection();
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLMapElement.prototype.name="";

/**
 * Object HTMLAreaElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLAreaElement(){};
HTMLAreaElement.prototype = new HTMLElement();
/**
 * Property accessKey
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.accessKey="";
/**
 * Property alt
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.alt="";
/**
 * Property coords
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.coords="";
/**
 * Property href
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.href="";
/**
 * Property noHref
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.noHref=false;
/**
 * Property shape
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.shape="";
/**
 * Property tabIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.tabIndex=0;
/**
 * Property target
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLAreaElement.prototype.target="";

/**
 * Object HTMLScriptElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLScriptElement(){};
HTMLScriptElement.prototype = new HTMLElement();
/**
 * Property text
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.text="";
/**
 * Property htmlFor
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.htmlFor="";
/**
 * Property event
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.event="";
/**
 * Property charset
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.charset="";
/**
 * Property defer
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.defer="";
/**
 * Property src
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.src="";
/**
 * Property type
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLScriptElement.prototype.type="";

/**
 * Object HTMLTableElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTableElement(){};
HTMLTableElement.prototype = new HTMLElement();
/**
 * Property caption
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLTableCaptionElement
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.caption = new HTMLTableCaptionElement();
/**
 * Property tHead
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLTableSectionElement
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.tHead = new HTMLTableSelectionElement();
/**
 * Property tFoot
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLTableSectionElement
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.tFoot = new HTMLTableSelectionElement();
/**
 * Property rows
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.rows = new HTMLCollection();
/**
 * Property tBodies
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.tBodies = new HTMLCollection();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.align="";
/**
 * Property bgColor
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.bgColor="";
/**
 * Property border
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.border="";
/**
 * Property cellPadding
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.cellPadding="";
/**
 * Property cellSpacing
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.cellSpacing="";
/**
 * Property frame
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.frame="";
/**
 * Property rules
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.rules="";
/**
 * Property summary
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.summary="";
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.width="";
/**
 * function createTHead();
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @returns {HTMLElement}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.createTHead = function(){return new HTMLElement();};
/**
 * function deleteTHead();
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.deleteTHead = function(){};
/**
 * function createTFoot();
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @returns {HTMLElement}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.createTFoot = function(){return new HTMLElement();};
/**
 * function deleteTFoot();
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.deleteTFoot = function(){};
/**
 * function createCaption();
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @returns {HTMLElement}
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.createCaption = function(){return new HTMLElement();};
/**
 * function deleteCaption();
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.deleteCaption = function(){};
/**
 * function insertRow(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @returns {HTMLElement}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.insertRow = function(index){return new HTMLElement();};
/**
 * function deleteRow(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableElement.prototype.deleteRow = function(index){};

/**
 * Object HTMLTableCaptionElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTableCaptionElement(){};
HTMLTableCaptionElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCaptionElement.prototype.align="";

/**
 * Object HTMLTableColElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTableColElement(){};
HTMLTableColElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableColElement.prototype.align="";
/**
 * Property ch
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableColElement.prototype.ch="";
/**
 * Property chOff
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableColElement.prototype.chOff="";
/**
 * Property span
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableColElement.prototype.span=0;
/**
 * Property vAlign
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableColElement.prototype.vAlign="";
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableColElement.prototype.width="";

/**
 * Object HTMLTableSelectionElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTableSelectionElement(){};
HTMLTableSelectionElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.align="";
/**
 * Property ch
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.ch="";
/**
 * Property chOff
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.chOff="";
/**
 * Property vAlign
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.vAlign="";
/**
 * Property rows
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.rows="";
/**
 * function insertRow(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @returns {HTMLElement}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.insertRow = function(index){return new HTMLElement();};
/**
 * function deleteRow(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableSelectionElement.prototype.deleteRow = function(index){};

/**
 * Object HTMLTableRowElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTableRowElement(){};
HTMLTableRowElement.prototype = new HTMLElement();
/**
 * Property rowIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.rowIndex=0;
/**
 * Property sectionRowIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.sectionRowIndex=0;
/**
 * Property cells
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type HTMLCollection
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.cells = new HTMLCollection();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.align="";
/**
 * Property bgColor
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.bgColor="";
/**
 * Property ch
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.ch="";
/**
 * Property chOff
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.chOff="";
/**
 * Property vAlign
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.vAlign="";
/**
 * function insertCell(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @returns {HTMLElement}
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.insertCell = function(index){return new HTMLElement();};
/**
 * function insertCell(index)
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @param {Number} index
 * @throws DOMException
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableRowElement.prototype.deleteCell = function(index){};

/**
 * Object HTMLTableRowElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLTableCellElement(){};
HTMLTableCellElement.prototype = new HTMLElement();
/**
 * Property cellIndex
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.cellIndex=0;
/**
 * Property abbr
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.abbr="";
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.align="";
/**
 * Property axis
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.axis="";
/**
 * Property bgColor
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.bgColor="";
/**
 * Property ch
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.ch="";
/**
 * Property chOff
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.chOff="";
/**
 * Property colSpan
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.colSpan=0;
/**
 * Property headers
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.headers="";
/**
 * Property height
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.height="";
/**
 * Property noWrap
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.noWrap=false;
/**
 * Property rowSpan
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Number
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.rowSpan=0;
/**
 * Property scope
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.scope="";
/**
 * Property vAlign
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.vAlign="";
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLTableCellElement.prototype.width="";

/**
 * Object HTMLFrameSetElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLFrameSetElement(){};
HTMLFrameSetElement.prototype = new HTMLElement();
/**
 * Property cols
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameSetElement.prototype.cols="";
/**
 * Property rows
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameSetElement.prototype.rows="";

/**
 * Object HTMLFrameElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLFrameElement(){};
HTMLFrameElement.prototype = new HTMLElement();
/**
 * Property frameBorder
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.frameBorder="";
/**
 * Property longDesc
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.longDesc="";
/**
 * Property marginHeight
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.marginHeight="";
/**
 * Property marginWidth
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.marginWidth="";
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.name="";
/**
 * Property noResize
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Boolean
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.noResize=false;
/**
 * Property scrolling
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.scrolling="";
/**
 * Property src
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.src="";
/**
 * Property contentDocument
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Document
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLFrameElement.prototype.contentDocument= new HTMLDocument();

/**
 * Object HTMLIFrameElement()
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @augments HTMLElement
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 * @see HTMLElement
 */
function HTMLIFrameElement(){};
HTMLIFrameElement.prototype = new HTMLElement();
/**
 * Property align
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.align="";
/**
 * Property frameBorder
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.frameBorder="";
/**
 * Property height
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.height="";
/**
 * Property longDesc
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.longDesc="";
/**
 * Property marginHeight
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.marginHeight="";
/**
 * Property marginWidth
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.marginWidth="";
/**
 * Property name
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.name="";
/**
 * Property scrolling
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.scrolling="";
/**
 * Property src
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.src="";
/**
 * Property width
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type String
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.width="";
/**
 * Property contentDocument
 * http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109/html.html
 * 
 * @type Document
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model HTML Specification.
 */
HTMLIFrameElement.prototype.contentDocument= new HTMLDocument();

/* Stylesheets */
/**
 * Object CSS2Properties()
 * http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113/ecma-script-binding.html
 * 
 * @augments Object
 * @constructor
 * @since Standard ECMA-262 3rd. Edition
 * @since Level 2 Document Object Model Style Specification.
 */
function CSS2Properties(){};
CSS2Properties.prototype = new Object();
=======
 ******************************************************************************/

/**
 * function querySelector(selectors)
 * http://www.w3.org/TR/2012/PR-selectors-api-20121213
 * @param {String} selectors
 * @memberOf Document
 * @returns {Element}      
 */ 
Document.prototype.querySelector=function(selectors){return new Element();};

/**
 * function querySelectorAll(selectors)
 * http://www.w3.org/TR/2012/PR-selectors-api-20121213
 * @param {String} selectors
 * @memberOf Document
 * @returns {NodeList}      
 */ 
Document.prototype.querySelectorAll=function(selectors){return new NodeList();};

/**
 * function querySelector(selectors)
 * http://www.w3.org/TR/2012/PR-selectors-api-20121213
 * @param {String} selectors
 * @memberOf DocumentFragment
 * @returns {Element}      
 */ 
DocumentFragment.prototype.querySelector=function(selectors){return new Element();};

/**
 * function querySelectorAll(selectors)
 * http://www.w3.org/TR/2012/PR-selectors-api-20121213
 * @param {String} selectors
 * @memberOf DocumentFragment
 * @returns {NodeList}      
 */ 
DocumentFragment.prototype.querySelectorAll=function(selectors){return new NodeList();};

/**
 * function querySelector(selectors)
 * http://www.w3.org/TR/2012/PR-selectors-api-20121213
 * @param {String} selectors
 * @memberOf Element
 * @returns {Element}      
 */ 
Element.prototype.querySelector=function(selectors){return new Element();};

/**
 * function querySelectorAll(selectors)
 * http://www.w3.org/TR/2012/PR-selectors-api-20121213
 * @param {String} selectors
 * @memberOf Element
 * @returns {NodeList}      
 */ 
Element.prototype.querySelectorAll=function(selectors){return new NodeList();};

/**
 * Property state
 * @type Object
 * @memberOf History
 */
History.prototype.state=new Object();

/**
 * function pushState(data,title,url)
 * http://www.w3.org/TR/2012/CR-html5-20121217/browsers.html#history
 * @param {Object} data
 * @param {String} title
 * @param {String} url - optional
 * @memberOf History
 */
History.prototype.pushState=function(data,title,url){};

/**
 * function replaceState(data,title,url)
 * http://www.w3.org/TR/2012/CR-html5-20121217/browsers.html#history
 * @param {Object} data
 * @param {String} title
 * @param {String} url - optional
 * @memberOf History
 */
History.prototype.replaceState=function(data,title,url){};

/**
 * Property sessionStorage
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @type Storage
 * @memberOf Window
 */
Window.prototype.sessionStorage=new Storage();

/**
 * Property localStorage
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @type Storage
 * @memberOf Window
 */
Window.prototype.localStorage=new Storage();

/**
 * Object Storage
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 */
function Storage(){};
Storage.prototype=new Object();

/**
 * Property length
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @type Number
 * @memberOf Storage
 */
Storage.prototype.length=new Number();

/**
 * function key(index)
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @param {Number} index
 * @memberOf Storage
 * @returns String
 */
Storage.prototype.key=function(index){return new String();};

/**
 * function getItem(key)
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @param {String} key
 * @memberOf Storage
 * @returns String
 */
Storage.prototype.getItem=function(key){return new String();};

/**
 * function setItem(key,value)
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @param {String} key
 * @param {String} value
 * @memberOf Storage
 */
Storage.prototype.setItem=function(key,value){};

/**
 * function removeItem(key)
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @param {String} key
 * @memberOf Storage
 */
Storage.prototype.removeItem=function(key){};

/**
 * function clear()
 * http://www.w3.org/TR/2011/CR-webstorage-20111208
 * @memberOf Storage
 */
Storage.prototype.clear=function(){};

/**
 * Object WebSocket
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @constructor
 * @param {String} url
 */
function WebSocket(url){};
WebSocket.prototype=new Object();

/**
 * Constant WebSocket.CONNECTING=0
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @constant
 * @type Number
 */
WebSocket.prototype.CONNECTING=0;

/**
 * Constant WebSocket.OPEN=1
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @constant
 * @type Number
 */
WebSocket.prototype.OPEN=1;

/**
 * Constant WebSocket.CLOSING=2
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @constant
 * @type Number
 */
WebSocket.prototype.CLOSING=2;

/**
 * Constant WebSocket.CLOSED=3
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @constant
 * @type Number
 */
WebSocket.prototype.CLOSED=3;

/**
 * Property url
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @type String
 * @memberOf WebSocket
 */
WebSocket.prototype.url=new String();

/**
 * Property readyState
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @type Number
 * @memberOf WebSocket
 */
WebSocket.prototype.readyState=new Number();

/**
 * Property bufferedAmount
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @type Number
 * @memberOf WebSocket
 */
WebSocket.prototype.bufferedAmount=new Number();

/**
 * Property extensions
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @type String
 * @memberOf WebSocket
 */
WebSocket.prototype.extensions=new String();

/**
 * Property protocol
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @type String
 * @memberOf WebSocket
 */
WebSocket.prototype.protocol=new String();

/**
 * Property binaryType
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @type String
 * @memberOf WebSocket
 */
WebSocket.prototype.binaryType=new String();

/**
 * function close(code,reason)
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @param {Number} code - optional
 * @param {String} reason - optional
 * @memberOf WebSocket
 */
WebSocket.prototype.close=function(code,reason){};

/**
 * function send(data)
 * http://www.w3.org/TR/2012/CR-websockets-20120920
 * @param {Object} data - may be a String, Blob, ArrayBuffer, or ArrayBufferView 
 * @memberOf WebSocket
 */
WebSocket.prototype.send=function(data){};

/**
 * Property geolocation
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Geolocation
 * @memberOf Navigator
 */
Navigator.prototype.geolocation=new Geolocation();

/**
 * Object Geolocation
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 */
function Geolocation(){};
Geolocation.prototype=new Object();

/**
 * function getCurrentPosition(successCallback,errorCallback,options)
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510/
 * @param {Function} successCallback (Position pos)
 * @param {Function} errorCallback (PositionError error) - optional
 * @param {PositionOptions} options - optional
 * @memberOf Geolocation
 */
Geolocation.prototype.getCurrentPosition=function(successCallback,errorCallback,options){};

/**
 * function watchPosition(successCallback,errorCallback,options)
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510/
 * @param {Function} successCallback (Position pos)
 * @param {Function} errorCallback (PositionError error) - optional
 * @param {PositionOptions} options - optional
 * @memberOf Geolocation
 * @returns {Number}
 */
Geolocation.prototype.watchPosition=function(successCallback,errorCallback,options){return new Number();};

/**
 * function clearWatch(watchId)
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @param {Number} watchId
 * @memberOf Geolocation
 */
Geolocation.prototype.clearWatch=function(watchId){};

/**
 * Object Coordinates
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 */
function Coordinates(){};
Coordinates.prototype=new Object();

/**
 * Property latitude
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.latitude=new Number();;

/**
 * Property longitude
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.longitude=new Number();;

/**
 * Property altitude
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.altitude=new Number();;

/**
 * Property accuracy
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.accuracy=new Number();;

/**
 * Property altitudeAccuracy
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.altitudeAccuracy=new Number();;

/**
 * Property heading
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.heading=new Number();;

/**
 * Property speed
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Coordinates
 */
Coordinates.prototype.speed=new Number();

/**
 * Object Position
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 */
function Position(){};
Position.prototype=new Object();

/**
 * Property coords
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Coordinates
 * @memberOf Position
 */
Position.prototype.coords=new Coordinates();

/**
 * Property timestamp
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf Position
 */
Position.prototype.timestamp=new Number;

/**
 * Object PositionError
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 */
function PositionError(){};
PositionError.prototype=new Object();

/**
 * Constant PositionError.PERMISSION_DENIED=1
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @constant
 * @type Number
 */
PositionError.prototype.PERMISSION_DENIED=1;

/**
 * Constant PositionError.POSITION_UNAVAILABLE=2
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @constant
 * @type Number
 */
PositionError.prototype.POSITION_UNAVAILABLE=2;

/**
 * Constant PositionError.TIMEOUT=3
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @constant
 * @type Number
 */
PositionError.prototype.TIMEOUT=3;

/**
 * Property code
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf PositionError
 */
PositionError.prototype.code=new Number();

/**
 * Property message
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type String
 * @memberOf PositionError
 */
PositionError.prototype.message=new String();

/**
 * Object PositionOptions
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 */
function PositionOptions(){};
PositionOptions.prototype=new Object();

/**
 * Property enableHighAccuracy
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Boolean
 * @memberOf PositionOptions
 */
PositionOptions.prototype.enableHighAccuracy=new Boolean();

/**
 * Property timeout
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf PositionOptions
 */
PositionOptions.prototype.timeout=new Number();

/**
 * Property maximumAge
 * http://www.w3.org/TR/2012/PR-geolocation-API-20120510
 * @type Number
 * @memberOf PositionOptions
 */
PositionOptions.prototype.maximumAge=new Number();

/**
 * Object TimeRanges
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 */
function TimeRanges(){};
TimeRanges.prototype=new Object();

/**
 * Property length
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf TimeRanges
 */
TimeRanges.prototype.length=new Number();

/**
 * function start(index)
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @param {Number} index
 * @memberOf TimeRanges
 * @returns {Number}
 */
function start(index) {return new Number();};

/**
 * function end(index)
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @param {Number} index
 * @memberOf TimeRanges
 * @returns {Number}
 */
function end(index) {return new Number();};

/**
 * Object MediaError
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 */
function MediaError(){};
MediaError.prototype=new Object();

/**
 * Constant MediaError.MEDIA_ERR_ABORTED=1
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
MediaError.prototype.MEDIA_ERR_ABORTED=1;

/**
 * Constant MediaError.MEDIA_ERR_NETWORK=2
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
MediaError.prototype.MEDIA_ERR_NETWORK=2;

/**
 * Constant MediaError.MEDIA_ERR_DECODED=3
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
MediaError.prototype.MEDIA_ERR_DECODE=3;

/**
 * Constant MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED=4
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
MediaError.prototype.MEDIA_ERR_SRC_NOT_SUPPORTED=4;

/**
 * Property code
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf MediaError
 */
MediaError.prototype.code=new Number();

/**
 * Object HTMLMediaElement
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @augments HTMLElement
 * @see HTMLElement
 */
function HTMLMediaElement(){};
HTMLMediaElement.prototype = new HTMLElement();

/**
 * Property src
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type String
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.src=new String();

/**
 * Property currentSrc
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type String
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.currentSrc=new String();

/**
 * Property crossOrigin
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type String
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.crossOrigin=new String();

/**
 * Constant HTMLMediaElement.NETWORK_EMPTY=0
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.NETWORK_EMPTY=0;

/**
 * Constant HTMLMediaElement.NETWORK_IDLE=1
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.NETWORK_IDLE=1;

/**
 * Constant HTMLMediaElement.NETWORK_LOADING=2
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.NETWORK_LOADING=2;

/**
 * Constant HTMLMediaElement.NETWORK_NO_SOURCE=3
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.NETWORK_NO_SOURCE=3;

/**
 * Property networkState
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.networkState=new Number();

/**
 * Property preload
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type String
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.preload=new String();

/**
 * Property buffered
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type TimeRanges
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.buffered=new TimeRanges();

/**
 * function load()
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.load=function(){};

/**
 * function canPlayType(type)
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @param {String} type
 * @memberOf HTMLMediaElement
 * @returns {String}
 */
HTMLMediaElement.prototype.canPlayType=function(type){new String();};

/**
 * Constant HTMLMediaElement.HAVE_NOTHING=0
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.HAVE_NOTHING=0;

/**
 * Constant HTMLMediaElement.HAVE_METADATA=1
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.HAVE_METADATA=1;

/**
 * Constant HTMLMediaElement.HAVE_CURRENT_DATA=2
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.HAVE_CURRENT_DATA=2;

/**
 * Constant HTMLMediaElement.HAVE_FUTURE_DATA=3
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.HAVE_FUTURE_DATA=3;

/**
 * Constant HTMLMediaElement.HAVE_ENOUGH_DATA=4
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @constant
 * @type Number
 */
HTMLMediaElement.prototype.HAVE_ENOUGH_DATA=4;

/**
 * Property readyState
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.readyState=new Number();

/**
 * Property seeking
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.seeking=new Boolean();

/**
 * Property currentTime
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.currentTime=new Number();

/**
 * Property initialTime
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */         
HTMLMediaElement.prototype.initialTime=new Number();

/**
 * Property duration
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.duration=new Number();

/**
 * Property startOffsetTime
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Date
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.startOffsetTime=new Date();

/**
 * Property paused
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.paused=new Boolean();

/**
 * Property defaultPlaybackRate
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.defaultPlaybackRate=new Number();

/**
 * Property playbackRate
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.playbackRate=new Number();

/**
 * Property played
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type TimeRanges
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.played=new TimeRanges();

/**
 * Property seekable
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type TimeRanges
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.seekable=new TimeRanges();

/**
 * Property ended
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.ended=new Boolean();

/**
 * Property autoplay
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.autoplay=new Boolean();

/**
 * Property loop
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.loop=new Boolean();

/**
 * function play()
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.play=function(){};

/**
 * function pause()
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.pause=function(){};

/**
 * Property controls
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.controls=new Boolean();

/**
 * Property volume
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.volume=new Number();

/**
 * Property muted
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.muted=new Boolean();
         
/**
 * Property defaultMuted
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Boolean
 * @memberOf HTMLMediaElement
 */
HTMLMediaElement.prototype.defaultMuted=new Boolean();

/**
 * Object HTMLAudioElement
 * http://www.w3.org/TR/2012/WD-html5-20120329/the-audio-element.html
 * @augments HTMLMediaElement
 * @constructor
 * @param {String} src
 * @see HTMLMediaElement
 */
function HTMLAudioElement(src){};
HTMLAudioElement.prototype = new HTMLMediaElement();

/**
 * Object HTMLVideoElement
 * http://www.w3.org/TR/2012/WD-html5-20120329/the-audio-element.html
 * @augments HTMLMediaElement
 * @see HTMLMediaElement
 */
function HTMLVideoElement(){};
HTMLVideoElement.prototype = new HTMLMediaElement();

/**
 * Property width
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLVideoElement
 */
HTMLVideoElement.prototype.width=new Number();

/**
 * Property height
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLVideoElement
 */
HTMLVideoElement.prototype.height=new Number();

/**
 * Property videoWidth
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLVideoElement
 */
HTMLVideoElement.prototype.videoWidth=new Number();

/**
 * Property videoHeight
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type Number
 * @memberOf HTMLVideoElement
 */
HTMLVideoElement.prototype.videoHeight=new Number();

/**
 * Property poster
 * http://www.w3.org/TR/2012/WD-html5-20120329/media-elements.html
 * @type String
 * @memberOf HTMLVideoElement
 */
HTMLVideoElement.prototype.poster=new String();

>>>>>>> origin/master
