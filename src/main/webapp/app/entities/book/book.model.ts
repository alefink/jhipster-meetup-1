import { BaseEntity } from './../../shared';

export class Book implements BaseEntity {
    constructor(
        public id?: number,
        public name?: string,
        public genre?: string,
        public author?: BaseEntity,
    ) {
    }
}
