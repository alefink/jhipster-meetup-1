import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { BooksBookModule } from './book/book.module';
import { BooksAuthorModule } from './author/author.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        BooksBookModule,
        BooksAuthorModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class BooksEntityModule {}
